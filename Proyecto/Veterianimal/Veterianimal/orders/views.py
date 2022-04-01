from msilib.schema import ListView
from django.shortcuts import render
from django.shortcuts import redirect
from carts.models import Cart
from .models import ShippingAddress
from .utils import destroy_order
from carts.utils import destroy_cart
from django.shortcuts import get_object_or_404
from pyexpat.errors import messages
from shipping_addresses.views import ShippingAddressListView
from .utils import get_or_create_order
from carts.utils import get_or_create_cart
from django.contrib.auth.decorators import login_required
from .mails import Mail
from django.contrib.auth.mixins import LoginRequiredMixin
from django.views.generic.list import ListView
from django.db.models.query import EmptyQuerySet

class OrderListView(LoginRequiredMixin, ListView):
    login_url = 'login'
    template_name = 'orders/orders.html'

    def get_queryset(self):
        return self.request.user.orders_completed()

# Create your views here.
@login_required(login_url='login')
def order(request):
    cart = get_or_create_cart (request)
    order = get_or_create_order(cart, request)

    return render (request, 'orders/order.html', {
        'cart': cart, 
        'order': order,
    })
@login_required(login_url='login')
def address(request):

    cart = get_or_create_cart(request)
    order = get_or_create_order(cart, request)

    shipping_address = order.get_or_set_shipping_address()
    can_choose_address = request.user.shippingaddress_set.all()

    return render(request, 'orders/address.html', {
        'cart': cart,
        'shipping_address': shipping_address,
        'order': order,
        'can_choose_address': can_choose_address
    }) 

@login_required(login_url='login')
def select_address(request):
    shipping_addresses = request.user.addresses

    return render(request, 'orders/select_address.html', {
        'shipping_addresses': shipping_addresses
    })

def check_address(request, pk):
    cart = get_or_create_cart (request)
    order = get_or_create_order(cart, request)

    shipping_address = get_object_or_404(ShippingAddress, pk=pk)

    if request.user.id != shipping_address.user_id:
        return redirect('carts:cart')

    order.update_shipping_address(shipping_address)

    return redirect('orders:address')


@login_required(login_url='login')
def confirm(request):
    cart = get_or_create_cart(request)
    order = get_or_create_order(cart, request)
    shipping_address = order.shipping_address
    if shipping_address is None:
        return redirect('orders:address')

    return render(request, 'orders/snippets/confirm.html', {
        'cart': cart,
        'order': order,
        'shipping_address': shipping_address
    })

@login_required(login_url='login')
def cancel(request):
    cart = get_or_create_cart(request)
    order = get_or_create_order(cart, request)

    if request.user.id != order.user_id:
        return redirect('carts:cart')

    order.cancel()

    destroy_cart(request)
    destroy_order(request)

    return redirect ('product')

    

@login_required(login_url='login')
def complete(request):
    cart = get_or_create_cart(request)
    order = get_or_create_order(cart, request)

    if request.user.id != order.user_id:
        return redirect('carts:cart')

    order.complete()
    Mail.send_complete_order(order, request.user)

    destroy_cart(request)
    destroy_order(request)

    #messages.success(request, 'Compra completada exitosamente')
    return redirect ('index')
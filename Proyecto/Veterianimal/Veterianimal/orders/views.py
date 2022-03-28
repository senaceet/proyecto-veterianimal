from django.shortcuts import render
from django.shortcuts import redirect
from carts.models import Cart
from .models import ShippingAddress
from django.shortcuts import get_object_or_404

from shipping_addresses.views import ShippingAddressListView
from .utils import get_or_create_order
from carts.utils import get_or_create_cart
from django.contrib.auth.decorators import login_required

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
    can_choose_address = request.user.shippingaddress_set.count() > 1

    return render(request, 'orders/address.html', {
        'cart': cart,
        'shipping_address': shipping_address,
        'order': order,
        'can_choose_address': can_choose_address
    }) 

@login_required(login_url='login')
def select_address(request):
    shipping_addresses = request.user.shippingaddress_set.all()

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
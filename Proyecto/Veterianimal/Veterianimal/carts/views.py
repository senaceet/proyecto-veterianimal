from django.shortcuts import render
from .models import Cart
from .utils import get_or_create_cart 
# Create your views here.
def cart(request):
    cart = get_or_create_cart(request)

    return render(request, 'shoping-cart.html',{

    })
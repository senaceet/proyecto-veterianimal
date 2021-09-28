from django.http import HttpResponse, request
from django.shortcuts import render
from django.contrib.auth import login
from django.contrib.auth import logout
from django.contrib.auth import authenticate
from django.shortcuts import redirect
from django.contrib import messages


def index(request):
    return render(request, 'index.html', {

    })

def product_detail(request):
    return render(request, 'product-detail.html',{

    })

def product(request):
    return render(request, 'product.html', {
        
    })

def user(request):
    return render (request, 'page-user.html', {
        
    })

def login_view(request):
    if request.method == 'POST':
        username = request.POST.get('username')
        password = request.POST.get('password')
        
        user = authenticate(username=username, password=password)
        if user:
            login(request, user)
            messages.success(request, 'Bienvenido {}'.format(user.username))
            return redirect('index')
        else: 
            messages.error(request, 'Usuario o contraseña incorrecta')
    return render(request, 'users/login.html',{

    })

def logout(request):
    logout(request)
    messages.success(request, 'Sesión finalizada')
    return redirect('login')


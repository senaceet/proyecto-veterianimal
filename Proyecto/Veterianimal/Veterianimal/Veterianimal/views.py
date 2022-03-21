
from django.shortcuts import render
from django.contrib.auth import logout
from django.contrib.auth import login
from django.contrib.auth import authenticate
from django.shortcuts import redirect
from django.contrib import messages
from django.contrib.auth import authenticate
from user.models import User_web
from django.shortcuts import render
from modelos.models import Inventory, DocumentType
from .forms import RegisterForm


def index(request):
    return render(request, 'index.html', {

    })

def contact(request):
    return render(request, 'contact.html', {
        
    })   

def user(request):
    return render (request, 'users/page-user.html', {
        
    })

def product_history(request):
    return render (request, 'users/product.html')

def history(request):
    
    Inventario = Inventory.objects.all

    return render (request, 'users/table-history.html', {
        'Inventario': Inventario,
    })   

def registrar_usuario(request):
    form = RegisterForm(request.POST or None)
  
    if request.method == 'POST' and form.is_valid():
       

        user = User_web.objects.create_user(
            username = form.cleaned_data.get('username'),
            email = form.cleaned_data.get('email'),
            name = form.cleaned_data.get('name'),
            password = form.cleaned_data.get('password'),
            id_doc = form.cleaned_data.get('id_doc'),
            address = form.cleaned_data.get('adress')
            )
        if user:
            login(request, user)
            messages.success(request, 'Usuario Creado existosamente')
            return redirect('index')

    return render(request, 'users/page-register.html', {
        'form' : form,
    
    })

def login_view(request):
   
    if request.method == 'POST':
        username = request.POST.get('username')
        password = request.POST.get('password')

        user = authenticate(username=username, password=password)
        if user:
            login(request, user)
            messages.success(request, 'Bienvenido {}'.format(user.username))
            return redirect('user')
        else:
            messages.error(request, 'usuario o contraseña no autenticado')

    return render(request, 'users/login.html',{

    })

def logout_view(request):
    logout(request)
    messages.success(request, 'Sesión finalizada')
    return redirect('login')


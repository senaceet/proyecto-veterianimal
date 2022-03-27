
from django.shortcuts import render
from django.contrib.auth import logout
from django.contrib.auth import login
from django.contrib.auth import authenticate
from django.shortcuts import redirect
from django.contrib import messages
from django.contrib.auth import authenticate
from django.contrib.auth.decorators import login_required
from user.models import User_web
from .forms import RegisterForm


def index(request):
    return render(request, 'index.html', {

    })

def contact(request):
    return render(request, 'contact.html', {
        
    })   
@login_required(login_url='login')
def user(request):
    return render (request, 'users/page-user.html')

def product_history(request):
    return render (request, 'users/product.html')

def registrar_usuario(request):
    form = RegisterForm(request.POST or None, request.FILES )
  
    if request.method == 'POST' and form.is_valid():

        user = User_web.objects.create_user(
            username = form.cleaned_data.get('username'),
            email = form.cleaned_data.get('email'),
            name = form.cleaned_data.get('name'),
            password = form.cleaned_data.get('password'),
            id_doc = form.cleaned_data.get('id_doc'),
            address = form.cleaned_data.get('adress'),
            documentType = form.cleaned_data.get('document'),
            image = form.cleaned_data.get('image')
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


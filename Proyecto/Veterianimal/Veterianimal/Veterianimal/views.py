from django.http import HttpResponse, request
from django.shortcuts import render
from django.contrib.auth import login
from django.contrib.auth import logout
from django.contrib.auth import authenticate
from django.shortcuts import redirect
from django.contrib import messages
from django.shortcuts import render
from modelos.models import DocumentType, User, UserType, user_web



def index(request):
    return render(request, 'index.html', {

    })

def product_detail(request):
    return render(request, 'product-detail.html',{

    })

def product(request):
    return render(request, 'product.html', {
        
    })

def contact(request):
    return render(request, 'contact.html', {
        
    })  

def Shopping(request):
    return render(request, 'shoping-cart.html', {

    })  

def history_user(request):
    return render (request, 'users/table-history.html', {
        
    })

def user(request):
    return render (request, 'users/page-user.html', {
        
    })

def registrar_usuario(request):
    tipo_de_documento = DocumentType.objects.all()
    if request.method == 'POST':
        usua = user_web()
        tipo_us = UserType()
        usuario = User()
        tipodoc = DocumentType()
        usuario.first_name = request.POST.get('name')
        usuario.username = request.POST.get('usua')
        usuario.email = request.POST.get('email')
        usuario.password = request.POST.get('pass')
        usuario.id = usuario.id
        tipodoc = DocumentType()
        tipodoc.id = int(request.POST.get('tipodoc'))
        tipo_us.id = '1'
        usua.id_doc = request.POST.get('numdoc')
        usua.documentType = tipodoc
        usua.usertype = tipo_us
        usua.user = usuario
        usuario.save()
        usua.save()
        return redirect('index.html')

    return render(request, 'users/page-register.html', {
        'tipo_documento': tipo_de_documento,
    })

def login_view(request):
   
    if request.method == "POST":
        try:
            usuario = User.objects.get(username=request.POST.get('username'),
                                        password=request.POST.get('password'))
            request.session['username'] = usuario.username
            messages.success(request, 'Bienvenido {}'.format(usuario.username))
            return redirect('user')
        except User.DoesNotExist as e:
            messages.error(request, 'Usuario o contraseña incorrecta')

    return render(request, 'users/login.html',{

    })

def logout_view(request):
    logout(request)
    messages.success(request, 'Sesión finalizada')
    return redirect('login')


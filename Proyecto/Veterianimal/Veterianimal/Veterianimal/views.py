from django.http import HttpResponse, request
from django.shortcuts import render
from django.contrib.auth import logout
from django.contrib.auth import authenticate
from django.shortcuts import redirect
from django.contrib import messages
from django.shortcuts import render
from modelos.models import DocumentType, User, user_web, Inventory
from products.models import Product


def index(request):
    return render(request, 'index.html', {

    })

def contact(request):
    return render(request, 'contact.html', {
        
    })  

def Shopping(request):
    return render(request, 'shoping-cart.html', {

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
    tipo_de_documento = DocumentType.objects.all()
    if request.method == 'POST':
        usua = user_web()
        usuario = User()
        tipodoc = DocumentType()
        usuario.first_name = request.POST.get('name')
        usuario.username = request.POST.get('usua')
        usuario.email = request.POST.get('email')
        usuario.password = request.POST.get('pass')
        usuario.id = usuario.id #Llama y asigna la id del usuario para que no permita los mismos nombres
        tipodoc.id = request.POST.get('tipodoc')#llama los id del documento
        usua.id_doc = request.POST.get('numedoc')
        usua.address = request.POST.get('address')
        usua.documentType = tipodoc
        usua.user = usuario
        usuario.save()
        usua.save()
        return redirect('index')#Retorna al index por el nombre que le ponemos en la url

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


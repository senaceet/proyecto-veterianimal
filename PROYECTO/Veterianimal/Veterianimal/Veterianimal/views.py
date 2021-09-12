from django.http import HttpResponse
from django.shortcuts import render

def index(request):
    return render(request, 'index.html', {
        'message': 'hola mundo',
        'numbers': [1, 2, 3, 4, 5], 
    })

def login(request):
    return render(request, 'login.html', {
        'message': 'hola mundo',
        'numbers': [1, 2, 3, 4, 5], 
    })
from django import forms
# from django.forms import widgets
from django.contrib.auth.forms import UserCreationForm
from django.contrib.auth.models import User
from django.db.models import fields

# from modelos.models import User

class CustomUserForm(UserCreationForm):
    model = User
    fields = {'first_name', 'last_name', 'email', 'username', 'password1', 'password2'}

 
        
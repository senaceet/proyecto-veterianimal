from django import forms
# from django.forms import widgets
from django.contrib.auth.models import User
from django.contrib.auth.forms import UserCreationForm
import smtplib

# from modelos.models import User

class UserLoginFrom(forms.Form):
    email = forms.EmailField(
        widget=forms.TextInput(
            attrs={
                'id': 'LoginEmail',
                'type': 'email',
                'class': 'form-control'
            }
        )
    )

    password = forms.CharField(
        widget=forms.PasswordInput(attrs={
            'id': 'LoginPassword',
            'type': 'password',
            'class': 'form-control',
        })
    )

class UsersSignUpForm(forms.Form):
    email = forms.EmailField(
        Widget=forms.TextInput(
            attrs={
                'id': 'signupEmail',
                'type': 'email',
                'class': 'form-control'
            }
        )
    )

    first_name = forms.CharField(
        max_length=100,
        widget=forms.TextInput(
            attrs={
                'type': 'text',
                'class': 'form-control'
            }
        )
    )

    last_name = forms.CharField(
        max_length=100,
        widget=forms.TextInput(
            attrs={
            'type': 'text',
            'class': 'form-control'
            }
        )
    )

    password = forms.CharField(
        widget=forms.PasswordInput(
            attrs={
                'id': 'LoginPassword',
                'type': 'password',
                'class': 'form-control'
            }
        )
    )
from django import forms
from modelos.models import DocumentType
# from django.forms import widgets
from user.models import User_web



class RegisterForm(forms.Form):
    username = forms.CharField(required=True, min_length=4, max_length=20,
                        widget=forms.TextInput(
                            attrs={
                                'class':'form-group',
                                'class':'form-control',
                                'placeholder':'Username'
                            }
                        ) )
    email =  forms.EmailField(required=True, max_length=150,
                        widget=forms.EmailInput(
                            attrs={
                                'class':'form-group', 
                                'class':'form-control',
                                'placeholder':'Correo Electronico'
                            }
                        ) )
    password = forms.CharField(required=True, max_length=30, min_length=8,  
                        widget=forms.TextInput(
                            attrs={
                                'class':'form-group', 
                                'class':'form-control',
                                'placeholder':'Contraseña'
                            }
                        ) )
    id_doc = forms.IntegerField(required=True,
                 widget=forms.NumberInput(
                            attrs={
                                'class':'form-group', 
                                'class':'form-control',
                                'placeholder':'Número de documento'
                            }
                        ) )
    adress = forms.CharField(required=True, min_length=10, max_length=25,
                            widget=forms.TextInput(
                            attrs={
                                'class':'form-group',
                                'class':'form-control',
                                'placeholder':'Dirección de Residencia',   
                            }
                         ) )
    name = forms.CharField(required=True, max_length=30, min_length=5, 
                        widget=forms.TextInput(
                            attrs={
                                'class':'form-group', 
                                'class':'form-control',
                                'placeholder':'Nombre'
                            }
                        ) )
    document = forms.ModelChoiceField(  
                        queryset= DocumentType.objects.all(), 
                        widget= forms.Select(
                            attrs={
                                'class':'form-group',
                                'class': 'form-control',
                                 
                            }
                            
                        ))
    image = forms.ImageField(required=False)


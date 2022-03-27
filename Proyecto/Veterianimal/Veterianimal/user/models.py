import random
import string
from django.utils.text import slugify
from django.contrib.auth.models import AbstractUser
from django.db import models
from django.utils.translation import gettext_lazy 
from modelos.models import DocumentType

# Create your models here.

class User_web(AbstractUser):
    id_doc = models.PositiveBigIntegerField (verbose_name='Identificación', null=True, unique=True)
    name = models.CharField(verbose_name='nombre', max_length=30, null=False)
    address = models.CharField (verbose_name='Dirección', max_length=50)
    image = models.ImageField(upload_to='user/media', default='user/default.png' )
    documentType = models.ForeignKey (DocumentType, null=True,on_delete=models.SET_NULL)

    def __str__(self):
        return self.username
    
    class Meta:
        verbose_name = 'Usuario'
        verbose_name_plural = 'Usuarios'
        db_table = "Usuario"
        ordering = ['id']

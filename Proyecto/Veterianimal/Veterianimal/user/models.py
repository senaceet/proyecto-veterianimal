import random
import string
from django.utils.text import slugify
from django.contrib.auth.models import AbstractUser
from django.db import models
from django.utils.translation import gettext_lazy 
from modelos.models import DocumentType
from orders.common import OrderStatus

# Create your models here.

class User_web(AbstractUser):
    id_doc = models.PositiveBigIntegerField (verbose_name='Identificación', null=True, unique=True)
    name = models.CharField(verbose_name='nombre', max_length=30, null=False)
    image = models.ImageField(upload_to='user/media', default='user/default.png' )
    documentType = models.ForeignKey (DocumentType, null=True,on_delete=models.SET_NULL)

    def __str__(self):
        return self.username

    @property
    def shipping_address(self):
        return self.shippingaddress_set.filter(default=True).first()

    def has_shipping_address(self):
        return self.shipping_address is not None

    def orders_completed(self):
        return self.order_set.filter(status=OrderStatus.COMPLETED).order_by('-id')

    def has_shipping_addresses(self):
        return self.shippingaddress_set.exists()

    def addresses(self):
        return self.shippingaddress_set.all()
    
    class Meta:
        verbose_name = 'Usuario'
        verbose_name_plural = 'Usuarios'
        db_table = "Usuario"
        ordering = ['id']

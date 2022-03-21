from django.db import models
from modelos.models import PaymentMethods
from Veterianimal import settings 
from products.models import Product

class Cart (models.Model):
    user = models.ForeignKey(settings.AUTH_USER_MODEL, null=True, blank=True, on_delete=models.CASCADE)
    products = models.ManyToManyField(Product)
    #Payment_Methods = models.ForeignKey (PaymentMethods, on_delete=models.CASCADE)
    subtotal = models.DecimalField(default=0.0, max_digits=8, decimal_places=2)
    total = models.DecimalField(default=0.0, max_digits=8, decimal_places=2)
    create_at = models.DateTimeField(auto_now_add=True)

    def __str__(self):
        return ''

    class Meta:
        verbose_name = 'Carrito de compra'
        verbose_name_plural = 'Carrito de compras'
        db_table = "Carrito_de_compra"
        ordering = ['id']


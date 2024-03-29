from django.db import models
from datetime import datetime
from django.db.models.fields import CharField, IntegerField 


class PaymentMethods (models.Model):
    description = models.TextField(verbose_name='Descripción')

    def __str__(self):
        return self.description
    
    class Meta:
        verbose_name = 'Método de pago'
        verbose_name_plural = 'Métodos de pago'
        db_table = 'Metodos_de_pago'
        ordering = ['id']


class DocumentType (models.Model):
    description = models.TextField(verbose_name='Descripción')

    def __str__(self):
        return self.description

    
    class Meta:
        verbose_name = 'Tipo de documento'
        verbose_name_plural = 'Tipos de documentos'
        db_table = 'Tipo_de_documento'
        ordering = ['id']

class Trademarks (models.Model):
    description = models.TextField(verbose_name='Descripción')

    def __str__(self):
        return self.description

    class Meta:
        verbose_name = 'Marca'
        verbose_name_plural = 'Marcas'
        db_table = 'Marcas'
        ordering = ['id']

class Invoice (models.Model):
    totalValue = models.IntegerField (verbose_name='Valor total')
    orderDate= models.DateTimeField (verbose_name='Fecha de pedido', default=datetime.now)
    deliveryDate = models.DateTimeField (verbose_name='Fecha de entrega', default=datetime.now)
    productQuantity = models.PositiveIntegerField(verbose_name='Cantidad del producto')
    product = models.CharField (verbose_name='Producto', max_length=60)
    paymentmethods = models.ForeignKey (PaymentMethods, on_delete=models.CASCADE)

    def __str__(self):
        return self.product

    class Meta:
        verbose_name = 'Factura'
        verbose_name_plural = 'Facturas'
        db_table = 'Factura'
        ordering = ['id']



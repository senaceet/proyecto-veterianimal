from django.db import models
from datetime import datetime
from django.contrib.auth.models import User
from django.db.models.fields import CharField, IntegerField 


class Inventory(models.Model):
    amount = models.PositiveIntegerField(verbose_name='Cantidad')
    total = models.IntegerField(verbose_name='Total')
    products = CharField(verbose_name='productos', max_length=80)

    def __str__(self):
        return self.products

    class Meta:
        verbose_name = 'Inventario'
        verbose_name_plural = 'Inventarios'
        db_table = 'Inventario'
        ordering = ['id']

class Category (models.Model):
    description = models.TextField (verbose_name='Descripción')

    def __str__(self):
        return self.description

    class Meta:
        verbose_name = 'Categoría'
        verbose_name_plural = 'Categorías'
        db_table = 'Categoria'
        ordering = ['id']

class PaymentMethods (models.Model):
    description = models.TextField(verbose_name='Descripción')

    def __str__(self):
        return self.description
    
    class Meta:
        verbose_name = 'Método de pago'
        verbose_name_plural = 'Métodos de pago'
        db_table = 'Metodos_de_pago'
        ordering = ['id']

class ShopingCart (models.Model):
    Commentary = models.TextField(verbose_name='comentario')
    Payment_Methods = models.ForeignKey (PaymentMethods, on_delete=models.CASCADE)

    def __str__(self):
        return self.Commentary

    class Meta:
        verbose_name = 'Carrito de compra'
        verbose_name_plural = 'Carrito de compras'
        db_table = "Carrito_de_compra"
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

class user_web (models.Model):
    #names = models.CharField(verbose_name='Nombres', max_length=100)
    id_doc = models.PositiveBigIntegerField (verbose_name='Identificación')
    user = models.OneToOneField(User, on_delete=models.CASCADE)
    address = models.CharField (verbose_name='Dirección', max_length=50)
    #username = models.CharField (verbose_name='Usuario', max_length=50)
    #password = models.CharField (verbose_name='Contraseña', max_length=100)
    documentType = models.ForeignKey (DocumentType, on_delete=models.CASCADE)


    def __str__(self):
        return self.address
    
    class Meta:
        verbose_name = 'Usuario'
        verbose_name_plural = 'Usuarios'
        db_table = "Usuario"
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



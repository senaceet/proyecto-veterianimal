from django.db import models
from datetime import datetime

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
    Payment_Methods = models.ForeignKey (PaymentMethods, on_delete=models.CASCADE)
    Commentary = models.TextField(verbose_name='comentario')

    def __str__(self):
        return self.Commentary

    class Meta:
        verbose_name = 'Carrito de compra'
        verbose_name_plural = 'Carrito de compras'
        db_table = "Carrito_de_compra"
        ordering = ['id']



class DocumentType (models.Model):
    description = models.TextField(verbose_name='Descripción')

    def __srt__(self):
        return self.descripcion

    
    class Meta:
        verbose_name = 'Tipo de documento'
        verbose_name_plural = 'Tipos de documentos'
        db_table = 'Tipo_de_documento'
        ordering = ['id']

class UserType (models.Model):
    description = models.TextField(verbose_name='Descripción')

    def __str__(self):
        return self.description

    class Meta:
        verbose_name = 'Tipo de usuario'
        verbose_name_plural = 'Tipos de usuario'
        db_table = 'Tipos_de_usuario'
        ordering = ['id']
        

class User (models.Model):
    names = models.CharField(verbose_name='Nombres', max_length=100)
    id_doc = models.IntegerField (verbose_name='Identificación')
    address = models.CharField (verbose_name='Dirección', max_length=50)
    username = models.CharField (verbose_name='Usuario', max_length=50)
    password = models.CharField (verbose_name='Contraseña', max_length=100)
    documentType = models.ForeignKey (DocumentType, on_delete=models.CASCADE)
    usertype = models.ForeignKey (UserType, on_delete=models.CASCADE)


    def __str__(self):
        return self.username
    
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


class Product(models.Model):
    code = models.CharField(verbose_name='Código', max_length=50)
    price = models.DecimalField(verbose_name='Precio', max_digits=10, decimal_places=2)
    name = models.CharField(verbose_name='Nombre', max_length=60)
    inventory = models.ForeignKey (Inventory, on_delete=models.CASCADE)
    category = models.ForeignKey (Category, on_delete=models.CASCADE)
    shopingcart = models.ForeignKey (ShopingCart, on_delete=models.CASCADE)
    paymentmethods = models.ForeignKey (PaymentMethods, on_delete=models.CASCADE)
    user = models.ForeignKey (User, on_delete=models.CASCADE)
    documentType = models.ForeignKey (DocumentType, on_delete= models.CASCADE)
    usertype = models.ForeignKey (UserType, on_delete=models.CASCADE)
    trademarks = models.ManyToManyField (Trademarks)




    def __str__(self):
        return self.name

    class Meta:
        verbose_name = 'Producto'
        verbose_name_plural = 'Productos'
        db_table = "Producto"
        ordering = ['id']

class Sale (models.Model):
    client = models.IntegerField (verbose_name='Cliente')
    product = models.CharField (verbose_name='Producto', max_length=60)

    def __str__(self):
        return self.product

    class Meta: 
        verbose_name = 'Venta'
        verbose_name_plural = 'Ventas'
        db_table = 'Venta'
        ordering = ['id']

class DeliveryCourier (models.Model):
    address = models.CharField (verbose_name='Dirección', max_length=50)
    id_doc = models.IntegerField (verbose_name='Identificación')
    phone_number = models.PositiveIntegerField(verbose_name='Teléfono')
    names = models.CharField (verbose_name='Nombres', max_length=60)
    sale = models.ForeignKey (Sale, on_delete=models.CASCADE)


    def __str__(self):
        return self.names

    class Meta:
        verbose_name = 'Mensajero'
        verbose_name_plural = 'Mensajeros'
        db_table = 'Mensajero'
        ordering = ['id']

class PayOrder (models.Model):
    amount = models.IntegerField (verbose_name='Cantidad')
    price = models.PositiveIntegerField (verbose_name='Precio')
    description = models.TextField (verbose_name='Descripción')
    product = models.CharField (verbose_name='Producto', max_length=60)
    deliverycourier = models.ForeignKey(DeliveryCourier, on_delete=models.CASCADE)

    def __str__(self):
        return self.product

    class Meta:
        verbose_name = 'Orden de pago'
        verbose_name_plural = 'Órdenes de pago'
        db_table = 'Orden_de_pago'
        ordering = ['id']


class Invoice (models.Model):
    totalValue = models.IntegerField (verbose_name='Valor total')
    orderDate= models.DateTimeField (verbose_name='Fecha de pedido', default=datetime.now)
    deliveryDate = models.DateTimeField (verbose_name='Fecha de entrega', default=datetime.now)
    invoiceCode = models.CharField (verbose_name='Código de factura', max_length=40)
    productQuantity = models.PositiveIntegerField(verbose_name='Cantidad del producto')
    product = models.CharField (verbose_name='Producto', max_length=60)
    paymentmethods = models.ForeignKey (PaymentMethods, on_delete=models.CASCADE)
    payorder = models.ForeignKey (PayOrder, on_delete=models.CASCADE)

    def __str__(self):
        return self.product

    class Meta:
        verbose_name = 'Factura'
        verbose_name_plural = 'Facturas'
        db_table = 'Factura'
        ordering = ['id']



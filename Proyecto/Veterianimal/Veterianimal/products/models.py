import uuid
from django.db import models
from django.contrib.auth.models import User
from django.utils.text import slugify
from django.db.models.signals import pre_save
from modelos.models import Category, ShopingCart, PaymentMethods, Trademarks
# Create your models here.

class Product(models.Model):
    code = models.CharField(verbose_name='Código', max_length=50)
    descrip= models.TextField(verbose_name='Descripción', max_length=500)
    weight= models.CharField(verbose_name='Peso', max_length=50)
    dimensions = models.CharField(verbose_name='Dimensiones', max_length=100)
    size= models.CharField(verbose_name='Tamaño', max_length= 100)
    flavor=models.CharField(verbose_name='Sabor', max_length=100)
    price = models.DecimalField(verbose_name='Precio', max_digits=10, decimal_places=2)
    name = models.CharField(verbose_name='Nombre', max_length=60)
    slug = models.SlugField(null=False, blank=False, unique=True)
    image = models.ImageField(upload_to='Veterianimal/static/imagenes', null=False, blank=False)
    created_at = models.DateTimeField(auto_now_add=True)
    category = models.ForeignKey (Category, on_delete=models.CASCADE)
    shopingcart = models.ForeignKey (ShopingCart, on_delete=models.CASCADE)
    paymentmethods = models.ForeignKey (PaymentMethods, on_delete=models.CASCADE)
    user = models.ForeignKey (User, on_delete=models.CASCADE)
    trademarks = models.ManyToManyField (Trademarks)

    def __str__(self):
        return self.name


    #def save (self,*args, **kwargs ):
        self.slug = slugify(self.name)
        super(Product, self).save(*args, **kwargs) 


def set_slug(sender, instance, *args, **kwargs): #callback
    if instance.name and not instance.slug:
        slug = slugify(instance.name)

        while Product.objects.filter(slug=slug).exists():
            slug = slugify(
                '{}-{}'.format(instance.name, str(uuid.uuid4())[:8])
            )
        #es objeto unico universal que genera ids aleatoreos
        instance.slug = slug

pre_save.connect(set_slug, sender=Product) 

class Meta:
        verbose_name = 'Producto'
        verbose_name_plural = 'Productos'
        db_table = "Producto"
        ordering = ['id']

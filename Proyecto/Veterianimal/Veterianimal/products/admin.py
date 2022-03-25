from ast import Pass
from django.contrib import admin

# Register your models here.
from .models import Product

class ProductAdmin(admin.ModelAdmin):
    fields = ('code', 'descrip', 'weight','flavor', 'price', 'name', 'image', 'trademarks' )
    list_display =('__str__', 'slug', 'created_at', 'image')  

admin.site.register(Product, ProductAdmin)
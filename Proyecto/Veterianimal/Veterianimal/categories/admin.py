from django.contrib import admin

# Register your models here.
from .models import Category

class CategoryAdmin(admin.ModelAdmin):
    fields = ('title', 'description', 'products' )
    list_display =('__str__', 'create_at')  

admin.site.register(Category, CategoryAdmin)

from django.contrib import admin
from django.contrib.auth.models import Group
from .models import Inventory
from .models import Category
from .models import PaymentMethods
from .models import DocumentType
from .models import Trademarks
from .models import Invoice

admin.site.site_header = 'Veterianimal'

class CategoryAdmin(admin.ModelAdmin):
    list_filter = ('description',)


admin.site.unregister(Group)
admin.site.register(Inventory)
admin.site.register(Category, CategoryAdmin)
admin.site.register(PaymentMethods)
admin.site.register(DocumentType)
admin.site.register(Trademarks)
admin.site.register(Invoice)




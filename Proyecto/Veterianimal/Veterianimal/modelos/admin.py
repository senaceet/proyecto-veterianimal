from django.contrib import admin

from .models import Inventory, user_web
from .models import Category
from .models import PaymentMethods
from .models import ShopingCart
from .models import DocumentType
from .models import user_web
from .models import Trademarks
from .models import Invoice

admin.site.register(Inventory)
admin.site.register(Category)
admin.site.register(PaymentMethods)
admin.site.register(ShopingCart)
admin.site.register(DocumentType)
admin.site.register(user_web)
admin.site.register(Trademarks)
admin.site.register(Invoice)




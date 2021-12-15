from django.contrib import admin

from .models import Inventory, user_web
from .models import Category
from .models import PaymentMethods
from .models import ShopingCart
from .models import DocumentType
from .models import user_web
from .models import UserType
from .models import Trademarks
from .models import Sale
from .models import Product
from .models import DeliveryCourier
from .models import PayOrder
from .models import Invoice

admin.site.register(Inventory)
admin.site.register(Category)
admin.site.register(PaymentMethods)
admin.site.register(ShopingCart)
admin.site.register(DocumentType)
admin.site.register(user_web)
admin.site.register(UserType)
admin.site.register(Trademarks)
admin.site.register(Sale)
admin.site.register(DeliveryCourier)
admin.site.register(PayOrder)
admin.site.register(Product)
admin.site.register(Invoice)




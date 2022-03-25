from django.contrib import admin
from django.contrib.auth.models import Group
from .models import Inventory
from .models import PaymentMethods
from .models import DocumentType
from .models import Trademarks
from .models import Invoice

admin.site.site_header = 'Veterianimal'


admin.site.unregister(Group)
admin.site.register(Inventory)
admin.site.register(PaymentMethods)
admin.site.register(DocumentType)
admin.site.register(Trademarks)
admin.site.register(Invoice)




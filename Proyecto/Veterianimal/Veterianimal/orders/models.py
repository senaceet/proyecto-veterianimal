from django.db import models
from enum import Enum
import uuid
from django.db.models.signals import pre_save
from user.models import User_web
from carts.models import Cart
from shipping_addresses.models import ShippingAddress

class OrderStatus(Enum):
    CREATED = 'CREATED'
    PAYED = 'PAYED'
    COMPLETED = 'COMPLETED'
    CANCELED = 'CANCELED'

choices = [ (tag, tag.value) for tag in OrderStatus ]


# Create your models here.
class Order (models.Model):
    order_id = models.CharField(max_length=100, null=False, blank=False, unique=True)
    user = models.ForeignKey(User_web, on_delete=models.CASCADE)
    cart = models.ForeignKey(Cart, on_delete=models.CASCADE)
    status = models.CharField(max_length=50, choices=choices, default=OrderStatus.CREATED)

    shipping_total = models.DecimalField (default=5000, max_digits=5, decimal_places=1)
    total = models.DecimalField (default=0, max_digits=8,  decimal_places=2)
    created_at = models.DateTimeField (auto_now_add=True)
    shipping_address = models.ForeignKey(ShippingAddress, null=True, blank=True, on_delete=models.CASCADE)

    def __str__(self):
        return self.order_id

    def get_or_set_shipping_address(self):
        if self.shipping_address:
            return self.shipping_address
        
        shipping_address = self.user.shipping_address
        if shipping_address:
            self.update_shipping_address(shipping_address)
        return shipping_address

    def update_shipping_address(self, shipping_address):
        self.shipping_address = shipping_address
        self.save()

    def get_total(self):
        return self.cart.total + self.shipping_total

    def update_total(self):
        self.total = self.get_total()  
        self.save()    

def set_order_id (sender, instance, *args, **kwargs):
    if not instance.order_id:
        instance.order_id = str(uuid.uuid4())

def set_total (sender, instance, *args, **kwargs):
    instance.total = instance.get_total()

def cancel(self):
    self.status = OrderStatus.CANCELED
    self.save()

def complete(self):
    self.status = OrderStatus.COMPLETED
    self.save()    

pre_save.connect(set_order_id, sender=Order)
pre_save.connect(set_total, sender=Order)
from datetime import datetime
from django.db import models
from user.models import User_web

# Create your models here.
class ShippingAddress(models.Model):
    user = models.ForeignKey(User_web, null=False, on_delete=models.CASCADE)
    line1 = models.CharField(max_length=200)
    line2 = models.CharField(max_length=200, blank=True)
    city = models.CharField(max_length=100, null=False, blank=False)
    reference = models.CharField(max_length=300)
    default = models.BooleanField(default=False)
    created_at = models.DateTimeField(auto_now_add=True)

    def __str__(self):
        return self.city

    def update_default(self, default=False):
        self.default = default
        self.save()
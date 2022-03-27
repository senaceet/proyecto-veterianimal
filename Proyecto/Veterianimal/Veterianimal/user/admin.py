from django.contrib import admin

# Register your models here.
from django.contrib.auth.admin import UserAdmin
from .models import User_web


admin.site.register(User_web)
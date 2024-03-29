"""Veterianimal URL Configuration

The `urlpatterns` list routes URLs to views. For more information please see:
    https://docs.djangoproject.com/en/3.2/topics/http/urls/
Examples:
Function views
    1. Add an import:  from my_app import views
    2. Add a URL to urlpatterns:  path('', views.home, name='home')
Class-based views
    1. Add an import:  from other_app.views import Home
    2. Add a URL to urlpatterns:  path('', Home.as_view(), name='home')
Including another URLconf
    1. Import the include() function: from django.urls import include, path
    2. Add a URL to urlpatterns:  path('blog/', include('blog.urls'))
"""
from unicodedata import name
from django.contrib import admin
from django.urls import path
from . import views
from django.conf import settings
from django.conf.urls.static import static
from django.urls import include
from rating.views import rating
from products.views import ProductListView, IndexListView


urlpatterns = [
    path('admin/', admin.site.urls),
    path('users/login', views.login_view, name='login'),
    path('logout', views.logout_view, name='logout'),
    path('contact/', views.contact, name='contact'),
    path('', IndexListView.as_view(), name='index'),
    path('users/rating/', rating, name='rating'),
    path('products/product/', ProductListView.as_view(), name='product'),
    path('users/product_history', views.product_history, name='history_product'),
    path('users/page-user/', views.user, name='user'),
    path('users/register/', views.registrar_usuario, name='registrar'),
    path('cart/', include('carts.urls')),
    path('product-detail/', include('products.urls')),
    path('orden/', include('orders.urls')),
    path('direcciones/', include('shipping_addresses.urls'))
]#llaves

if settings.DEBUG:
    urlpatterns += static(settings.MEDIA_URL, document_root = settings.MEDIA_ROOT) 

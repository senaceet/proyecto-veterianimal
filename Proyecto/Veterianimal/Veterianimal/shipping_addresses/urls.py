from stat import S_ENFMT
from django.urls import path

from . import views

app_name = "shipping_addresses"

urlpatterns = [
    path('', views.ShippingAddressListView.as_view(), name='shipping_addresses'),
    path('nuevo', views.create, name='create'),
    path('editar/<int:pk>', views.ShippingAddressUpdateview.as_view(), name='update'),
    path('eliminar/<int:pk>', views.ShippingAddressDeleteview.as_view(), name='delete'),
    path('default/<int:pk>', views.default, name='default')
]
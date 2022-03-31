from django.urls import path
from . import views

urlpatterns = [
    path('search', views.ProductSearchListView.as_view(), name='search'),
    path('comida', views.ProductcomidaListView.as_view(), name='comida'),
    path('servicio', views.ProductServListView.as_view(), name='servicio'),
    path('accesorio', views.ProductAcceListView.as_view(), name='accesorio'),
    path('<slug:slug>', views.ProducDetailView.as_view(), name='detail' ),
    
]

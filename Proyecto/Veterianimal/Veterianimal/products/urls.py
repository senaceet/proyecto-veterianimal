from django.urls import path

from . import views

urlpatterns = [
    path('<slug:slug>', views.ProducDetailView.as_view(), name='detail' )
]

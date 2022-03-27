from django.urls import path
from . import views

urlpatterns = [
    path('<pk:slug>/', views.UserDetailView.as_view(), name='user'), 
]

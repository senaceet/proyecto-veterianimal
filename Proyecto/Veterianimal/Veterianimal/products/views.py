from django.views.generic.list import ListView
from django.views.generic.detail import DetailView
from django.shortcuts import render
from .models import Product
from categories.models import Category
from django.db.models import Q

# Create your views here.
class ProductListView(ListView):
    template_name= 'products/product.html'

    queryset = Product.objects.all().order_by('-id')

    def get_context_data(self, **kwargs):
        context = super().get_context_data(**kwargs) 

        return context

class IndexListView(ListView):
    template_name= 'index.html'

    queryset = Product.objects.all().order_by('-id')

    def get_context_data(self, **kwargs):
        context = super().get_context_data(**kwargs) 

        return context

class ProducDetailView(DetailView):
    model = Product
 
    template_name = 'products/product-detail.html'

    def get_context_data(self, **kwargs):
          context = super().get_context_data(**kwargs)
          
          print(context)

          return context


class ProductSearchListView(ListView):

    template_name = 'products/search.html'

    def get_queryset(self):
        filters = Q(name__icontains=self.query()) | Q(category__title__icontains=self.query())
        return Product.objects.filter(filters)

    def query(self):
         return self.request.GET.get('q')  

    def get_context_data(self, **kwargs):
        context = super().get_context_data(**kwargs) 
        context['query'] = self.query()
        context['count'] = context['product_list'].count()

        return context     

class ProductcomidaListView(ListView):
    
    template_name = 'products/product_com.html'

    def get_queryset(self):
        filter = Q(category__title__icontains="Comida")
        return Product.objects.filter(filter)

    def get_context_data(self, **kwargs):
        context = super().get_context_data(**kwargs) 
        context['products'] = context['product_list']
        context['count'] = context['product_list'].count()

        return context 

class ProductServListView(ListView):
    
    template_name = 'products/product_ser.html'

    def get_queryset(self):
        filter = Q(category__title__icontains="Servicio")
        return Product.objects.filter(filter)

    def get_context_data(self, **kwargs):
        context = super().get_context_data(**kwargs) 
        context['products'] = context['product_list']
        context['count'] = context['product_list'].count()

        return context         

class ProductAcceListView(ListView):
    
    template_name = 'products/product_acce.html'

    def get_queryset(self):
        filter = Q(category__title__icontains="Accesorios")
        return Product.objects.filter(filter)

    def get_context_data(self, **kwargs):
        context = super().get_context_data(**kwargs) 
        context['products'] = context['product_list']
        context['count'] = context['product_list'].count()

        return context         
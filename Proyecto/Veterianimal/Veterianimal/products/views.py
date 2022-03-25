
from re import template
from unicodedata import name
from django.views.generic.list import ListView
from django.views.generic.detail import DetailView

from categories.models import Category
from .models import Product
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
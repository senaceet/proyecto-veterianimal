
from django.views.generic.list import ListView
from django.views.generic.detail import DetailView
from .models import Product

# Create your views here.
class ProductListView(ListView):
    template_name= 'products/product.html'

    queryset = Product.objects.all().order_by('-id')

    def get_context_data(self, **kwargs):
        context = super().get_context_data(**kwargs) 
        
        print(context)

        return context

class IndexListView(ListView):
    template_name= 'index.html'

    queryset = Product.objects.all().order_by('-id')

    def get_context_data(self, **kwargs):
        context = super().get_context_data(**kwargs) 
        
        print(context)

        return context
    


class ProducDetailView(DetailView):
    model = Product
    template_name = 'products/product-detail.html'

    def get_context_data(self, **kwargs):
          context = super().get_context_data(**kwargs)
          
          print(context)

          return context

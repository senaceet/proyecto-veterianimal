from django.contrib import admin

# Register your models here.
from rating.models import Rating

class RatingAdmin(admin.ModelAdmin):
    fields = ('qualification', 'review' , 'user')
    list_display =('__str__', 'user', 'create_at', 'review' )  

admin.site.register(Rating, RatingAdmin)

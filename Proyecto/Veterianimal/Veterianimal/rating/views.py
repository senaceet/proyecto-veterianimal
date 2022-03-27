from django.shortcuts import render
from django.contrib import messages
from django.shortcuts import redirect
from django.contrib.auth.decorators import login_required
from .models import Rating
# Create your views here.
@login_required(login_url='login')
def rating(request):
    if request.method == 'POST':
        rating = Rating()
        rating.user = request.user
        rating.qualification = request.POST.get('estrellas')
        rating.review = request.POST.get('review')
        rating.save()
        messages.success(request, 'Tu calificación ha sido registrada correctamente')
        return redirect('user')
    return render(request, 'users/review.html', {
        
    })

def list_rating(request):
    ratings = rating.objects.all()
    return render(request, 'index.html', {
        'ratings': ratings,
    })
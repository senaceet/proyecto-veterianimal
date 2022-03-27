from django.db import models
from Veterianimal import settings 

# Create your models here.
class Rating(models.Model):
    id_Rating = models.AutoField('id_Rating', primary_key=True)
    qualification = models.PositiveIntegerField('Calificación', default=1)
    review = models.TextField('Reseña', max_length=200)
    user = models.ForeignKey(settings.AUTH_USER_MODEL, null=True, blank=True, on_delete=models.CASCADE)
    create_at = models.DateTimeField(auto_now_add=True)

    def __str__(self):
        return str(self.qualification)
    
    class Meta:
        verbose_name = 'Calificación'
        verbose_name_plural = 'Calificaciones'
        db_table = 'Rating'
        ordering = ['id_Rating']
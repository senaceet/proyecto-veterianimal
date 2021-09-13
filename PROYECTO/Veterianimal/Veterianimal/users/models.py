from django.db import models

class User(models.Model):
    name= models.CharField(verbose_name = 'Usuario', max_length=50)
    password= models.CharField(verbose_name ='Password', max_length=20)

    def str(self):
        return self.name

    class Meta:
        verbose_name = 'Usuario'
        verbose_name_plural = ' Usuarios'
        db_table = 'User'
        ordering = ['id']

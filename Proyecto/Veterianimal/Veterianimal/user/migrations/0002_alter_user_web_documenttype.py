# Generated by Django 3.2.7 on 2022-03-20 23:49

from django.db import migrations, models
import django.db.models.deletion


class Migration(migrations.Migration):

    dependencies = [
        ('modelos', '0001_initial'),
        ('user', '0001_initial'),
    ]

    operations = [
        migrations.AlterField(
            model_name='user_web',
            name='documentType',
            field=models.ForeignKey(null=True, on_delete=django.db.models.deletion.CASCADE, to='modelos.documenttype', verbose_name='tipo de documento'),
        ),
    ]

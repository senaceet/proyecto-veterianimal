# Generated by Django 3.2.7 on 2022-03-21 00:01

from django.db import migrations, models
import django.db.models.deletion


class Migration(migrations.Migration):

    dependencies = [
        ('modelos', '0001_initial'),
        ('user', '0002_alter_user_web_documenttype'),
    ]

    operations = [
        migrations.AlterField(
            model_name='user_web',
            name='documentType',
            field=models.ForeignKey(null=True, on_delete=django.db.models.deletion.CASCADE, to='modelos.documenttype'),
        ),
    ]
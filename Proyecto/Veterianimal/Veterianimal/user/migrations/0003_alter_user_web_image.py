# Generated by Django 3.2.7 on 2022-03-27 20:47

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('user', '0002_alter_user_web_image'),
    ]

    operations = [
        migrations.AlterField(
            model_name='user_web',
            name='image',
            field=models.ImageField(default='user/default.png', upload_to='user/media'),
        ),
    ]
# Generated by Django 3.2.7 on 2022-03-25 11:20

import datetime
from django.db import migrations, models
import django.db.models.deletion


class Migration(migrations.Migration):

    initial = True

    dependencies = [
    ]

    operations = [
        migrations.CreateModel(
            name='DocumentType',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('description', models.TextField(verbose_name='Descripción')),
            ],
            options={
                'verbose_name': 'Tipo de documento',
                'verbose_name_plural': 'Tipos de documentos',
                'db_table': 'Tipo_de_documento',
                'ordering': ['id'],
            },
        ),
        migrations.CreateModel(
            name='Inventory',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('amount', models.PositiveIntegerField(verbose_name='Cantidad')),
                ('total', models.IntegerField(verbose_name='Total')),
                ('products', models.CharField(max_length=80, verbose_name='productos')),
            ],
            options={
                'verbose_name': 'Inventario',
                'verbose_name_plural': 'Inventarios',
                'db_table': 'Inventario',
                'ordering': ['id'],
            },
        ),
        migrations.CreateModel(
            name='PaymentMethods',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('description', models.TextField(verbose_name='Descripción')),
            ],
            options={
                'verbose_name': 'Método de pago',
                'verbose_name_plural': 'Métodos de pago',
                'db_table': 'Metodos_de_pago',
                'ordering': ['id'],
            },
        ),
        migrations.CreateModel(
            name='Trademarks',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('description', models.TextField(verbose_name='Descripción')),
            ],
            options={
                'verbose_name': 'Marca',
                'verbose_name_plural': 'Marcas',
                'db_table': 'Marcas',
                'ordering': ['id'],
            },
        ),
        migrations.CreateModel(
            name='Invoice',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('totalValue', models.IntegerField(verbose_name='Valor total')),
                ('orderDate', models.DateTimeField(default=datetime.datetime.now, verbose_name='Fecha de pedido')),
                ('deliveryDate', models.DateTimeField(default=datetime.datetime.now, verbose_name='Fecha de entrega')),
                ('productQuantity', models.PositiveIntegerField(verbose_name='Cantidad del producto')),
                ('product', models.CharField(max_length=60, verbose_name='Producto')),
                ('paymentmethods', models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to='modelos.paymentmethods')),
            ],
            options={
                'verbose_name': 'Factura',
                'verbose_name_plural': 'Facturas',
                'db_table': 'Factura',
                'ordering': ['id'],
            },
        ),
    ]

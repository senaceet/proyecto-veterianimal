from dataclasses import fields
from pyexpat import model
from django.forms import ModelForm
from .models import ShippingAddress

class ShippingAddressForm(ModelForm):
    class Meta:
        model = ShippingAddress
        fields = [
            'line1','line2','city','reference'
        ]

        labels = {
            'line1': 'Calle 1',
            'line2': 'Calle 2',
            'city': 'Ciudad',
            'reference': 'Referencias',
        }

    def __init__(self, *args, **kwargs):
        super().__init__(*args, **kwargs)

        self.fields['line1'].widget.attrs.update({
            'class': 'form-group',
            'class': 'form-control',
        })
        self.fields['line2'].widget.attrs.update({
            'class': 'form-group',
            'class': 'form-control',
        })
        self.fields['city'].widget.attrs.update({
            'class': 'form-group',
            'class': 'form-control',
        })
        self.fields['reference'].widget.attrs.update({
            'class': 'form-group',
            'class': 'form-control',
        })
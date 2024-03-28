from django import forms
from .models import Registration
class Studentform(forms.ModelForm):
    class Meta:
        model = Registration
        fields =['first_name','last_name','phone_number','password']

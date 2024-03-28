from django.shortcuts import render,redirect
from .models import Registration
from .forms import Studentform

# Create your views here.
def index(request):
    form = Studentform()
    return render(request, 'index.html', {'form': form})

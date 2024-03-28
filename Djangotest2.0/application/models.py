from django.db import models

# Create your models here.
class Registration(models.Model):
    first_name = models.CharField(max_length=20)
    last_name = models.CharField(max_length=20)
    phone_number = models.IntegerField(max_length=11)
    password = models.CharField(max_length=20)
    def __str__(self):
        return  self.first_name


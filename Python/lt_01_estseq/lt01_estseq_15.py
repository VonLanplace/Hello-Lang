from math import pow, sqrt

cat1=(pow((float(input("Insira o valor do Cateto Oposto: "))),2))
cat2=(pow((float(input("Insira o valor do Cateto Adjacente: "))),2))
print("O valor da hipotenusa é",round((sqrt(cat1+cat2)),2),".")

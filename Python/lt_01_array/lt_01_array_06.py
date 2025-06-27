import random

lista = []
max = 1000
min = 0

for i in range(20):
    lista.append(random.randint(0, 1000))

print(lista)

for i in range(len(lista)):
    for j in range(i + 1, len(lista)):
        if lista[i] > lista[j]:
            aux = lista[i]
            lista[i] = lista[j]
            lista[j] = aux

print(lista)

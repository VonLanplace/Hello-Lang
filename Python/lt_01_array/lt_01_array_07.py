import random


def makelista():
    lista = []
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

    return lista


def findvet(lista, min, max, find):
    if min < max:
        meio = int(((max - min) / 2) + min)
        print(min, meio, max, "|")
        if lista[meio] > find:
            findvet(lista, min, meio, find)
        elif lista[meio] < find:
            findvet(lista, meio, max, find)
        else:
            print("Valor Encontrado na casa", meio + 1, ".\n")
    else:
        print("Valor não Encontrado")


lista = makelista()
findvet(lista, 0, len(lista), int(input("Insira o valor a ser procurado:")))

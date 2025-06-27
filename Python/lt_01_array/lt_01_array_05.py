lista = []

for i in range(0, 5):
    lista.append(int(input("Insira um valor inteiro: ")))

print("\n", lista, "\n")

for i in range(len(lista)):
    print("O valor de", lista[i], "-", lista[-(i + 1)], "=", lista[i] - lista[-(i + 1)])

print("")

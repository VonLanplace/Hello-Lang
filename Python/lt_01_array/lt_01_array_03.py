num = 3
lista1 = []
lista2 = []
lista3 = []

for i in range(0, num * 2):
    if i <= num:
        lista1.append(int(input("Insira um numero inteiro: ")))
    else:
        lista2.append(int(input("Insira um numero inteiro: ")))

for x in lista1:
    lista3.append(x)
for x in lista2:
    lista3.append(x)

print("\nOs valores da Lista sao:\n", lista3)

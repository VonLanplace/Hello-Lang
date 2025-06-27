lista = []

for i in range(0, 5):
    loop = True

    while loop:
        lista.append(int(input("Insira um valor Real: ")))

        if lista[i] > 0:
            loop = False

media = 0.0
acima = 0
abaxo = 0

for x in lista:
    acima += 1
    media += x

media /= acima
acima = 0

for x in lista:
    if x > media:
        acima += 1
    if x < media:
        abaxo += 1

print(
    "\nA media e",
    media,
    ".\nAs notas acima sao",
    acima,
    ".\nAs notas abaixo sao",
    abaxo,
    ".\n",
)

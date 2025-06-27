vetor = []

for i in range(0, 5):
    vetor.append(int(input("Insira um numero Inteiro: ")))

maior = vetor[0]
menor = vetor[0]
media = 0.0

for x in vetor:
    media += x
    if x > maior:
        maior = x
    if x < menor:
        menor = x

media /= len(vetor)
print(
    "\nO valor do maior e",
    maior,
    ".\nO valor do menor e",
    menor,
    ".\nO valor da Media e",
    media,
)

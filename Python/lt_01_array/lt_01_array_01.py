media = 0.0
num = 0
soma = 0

vetor = []

for i in range(0, 50):
    vetor.append(int(input("insira um numero: ")))

for i in vetor:
    if i > 10 and i < 200:
        media += i
        num += 1
    if i % 2 == 1:
        soma += i

if num != 0:
    media /= num

print("\nA soma e", soma, "e a media e", "%2.lf" % media, ".\n")

nesimo = int(input("Insira o N'ésimo termo a ser encontrado: "))
Vet = [1, 1, 1]
if nesimo > 2:
    for i in range(3, nesimo + 1, 1):
        Vet[2] = Vet[0] + Vet[1]
        Vet[0] = Vet[1]
        Vet[1] = Vet[2]

print("O valor do Termo", nesimo, "é", Vet[2])

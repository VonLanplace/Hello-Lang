num1 = int(input("Insira um número Inteiro: "))
num2 = int(input("Insira um número Inteiro: "))
if num2 > num1:
    aux = num1
    num1 = num2
    num2 = aux
SOMA = 0

for i in range(num2 + 1, num1, 1):
    if i % 2 == 1:
        SOMA += i

print("A soma dos Impares entre", num2, "e", num1, "é", SOMA)

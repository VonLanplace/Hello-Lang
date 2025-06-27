num = int(input("Insira o valor a ser fatorado: "))
fat = num
for i in range(1, num, 1):
    fat *= i
print("O fatorial é", fat)

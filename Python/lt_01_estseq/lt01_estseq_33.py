num = int(float(input("Insira o Número: ")))
resp = 0
for i in range(1, num + 1, 1):
    resp += 1 / i
print("O valor da Série com", num, "termos será", resp)

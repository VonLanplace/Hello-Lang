num = float(input("Insira um valor: "))
print("\nA Tabuada de", num, "É:\n")
for i in range(1, 11, 1):
    print(num, "*", i, "=", num * i, ".")

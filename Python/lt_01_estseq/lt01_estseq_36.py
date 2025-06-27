def ffatorial(num) -> int:
    fat = 1
    for i in range(1, num + 1, 1):
        fat *= i
    return fat


def fserie(num) -> float:
    soma = 1
    if num > 1:
        for i in range(1, num + 1, 1):
            soma += 1 / ffatorial(i)
    return soma


num = int(input("Insira o numero de Elementos da Série:"))
print("O valor da Série com", num, "valores é:", fserie(num))

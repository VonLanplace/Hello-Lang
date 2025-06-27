investimento=(int(input("Insira o tipo de Investimento: ")))
if investimento==1:
    investimento=((float(input("insira o Valor do investimento: ")))*1.03)
    print("O valor corrigido é",investimento)
elif investimento==2:
    investimento=((float(input("insira o Valor do investimento: ")))*1.05)
    print("O valor corrigido é",investimento)
else:
    print("Opção inválida!")

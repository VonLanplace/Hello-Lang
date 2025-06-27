num1=float(input("Insira o 1º Valor: "))
num2=float(input("Insira o 2º Valor: "))
if num2>num1:
    aux=num1
    num1=num2
    num2=aux
print("O valor da diferença é",num1-num2,".")

num1=(int(input("Insira o 1º valor: ")))
num2=(int(input("Insira o 2º valor: ")))

if num2>num1:
    aux=num1
    num1=num2
    num2=aux

if num1%num2==0:
    print(num1,"É múltiplo de",num2,".")
else:
    print(num1,"Não é múltiplo de",num2,".")

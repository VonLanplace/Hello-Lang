menor=int(input("Insira um valor Inteiro: "))
maior=int(input("Insira um Valor inteiro: "))
if menor>maior:
    aux=maior
    maior=menor
    menor=aux

for i in range(menor+1,maior,1):
    if i == 1 or i==2:
        print(i,"É Primo!")
    else:
        for j in range(2,i+1,1):
            if i % j == 0 and not i==j:
                print(i,"Não é primo!")
                break
            elif j == i:
                print(i,"É Primo!")


#n/n^2-n/n^2 ou 1/n

num=int(input("Insira o numero do Termo: "))
#num=15
resp=0
for i in range(1,num+1,1):
    if i % 2 == 0:
        resp-=(1/i)
    elif i % 2 != 0:
        resp+=(1/i)
print("O Valor da Série  com",num,"termos é",resp)

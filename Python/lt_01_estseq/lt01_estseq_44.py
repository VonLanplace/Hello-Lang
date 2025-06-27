base=int(input("Insira o Valor da Base: "))
expoente=int(input("Insira o Valor do Expoente: "))
RESP=base
if expoente != 0 != 1:
    for i in range(1,expoente,1):
        print(base,expoente,RESP)
        RESP*=base
elif expoente == 0:
    RESP=1
print(RESP)

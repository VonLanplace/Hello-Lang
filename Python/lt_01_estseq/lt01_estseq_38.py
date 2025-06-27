for i in range(0,100,1):
    numI=int(input("Insira um número real: "))
    if i==0:
        maior=numI
        menor=numI
    else:
        if numI>=maior:
            maior=numI
        elif numI<=menor:
            menor=numI
print("O maior valor é",maior,"\nO menor valor é",menor)

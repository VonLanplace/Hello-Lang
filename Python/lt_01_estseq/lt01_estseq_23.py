Vet=[]
for i in range(0,4,1):
    Vet.append(float(input("Insira o "+str(i+1)+" º Valor: ")))
for i in range(0,4,1):
    for j in range(i,4,1):
        if Vet[i]>Vet[j]:
            aux=Vet[i]
            Vet[i]=Vet[j]
            Vet[j]=aux
print("\n",Vet)

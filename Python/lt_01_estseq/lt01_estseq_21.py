nota = 0.0
for i in range(0,4,1):
    nota+=((float(input("Insira a "+(str(i+1)) +"º nota Bimestral: ")))/4)

if nota>=6.0:
    print("APROVADO - NOTA:",nota)
elif nota>=3.0:
    print("EXAME - NOTA:",nota)
else:
    print("REPROVADO - NOTA:",nota)

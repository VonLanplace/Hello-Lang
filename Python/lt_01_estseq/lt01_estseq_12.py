ano=(int(input("Insira o valor do Ano Atual: ")))
ano-=(int(input("Insira o valor do Ano de Nascimento: ")))
if ano>=0:
    print("A idade é",ano,"\nDaqui a 17 anos a idade será",ano+17)
else:
    print("Não existe idade negativa!")

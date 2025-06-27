preco_atual=(float(input("Insira o Preço Atual: ")))
media_mensal=(float(input("Insira a Media Mensal de Vendas: ")))

if media_mensal>=1000 and preco_atual>=80:
    preco_atual*=0.95
elif media_mensal<500 and preco_atual<30:
    preco_atual*=1.1
elif 1000>media_mensal>=500 and 80>preco_atual>=30:
    preco_atual*=1.15

print("O novo preço é",preco_atual,"!")

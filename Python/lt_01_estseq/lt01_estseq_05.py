from math import pow, sqrt

axx=(int(input("Insira o Valor de ax²: ")))
bx=(int(input("Insira o Valor de bx: ")))
c=(int(input("Insira o Valor de c: ")))
delta=(pow(bx,2)-(4*(axx*c)))
print(delta)
if delta>0:
    c=((-bx+sqrt(delta))/(2*axx))
    delta=((-bx-sqrt(delta))/(2*axx))
    print("O valor de x' será ",c,".\nO Valor de x'' será ",delta,".")
elif delta==0:
    c=-bx/(2*axx)
    print("O valor de x será ",c,".")
else:
    delta*= -1
    axx*=2
    bx*=-1
    print("O valor de x' será ",bx,"/",axx,"+(i√",delta,")/",axx,".\nO valor de x'' será ",bx,"/",axx,"-(i√",delta,")/",axx,".")



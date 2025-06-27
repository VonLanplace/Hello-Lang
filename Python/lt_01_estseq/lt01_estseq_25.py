text=input("Insira a Hora do Inicio: ")
hora_inicio=int(text[:2])
minuto_inicio=int(text[3:])

text=input("Insira a Hora do Final: ")
hora_final=int(text[:2])
minuto_final=int(text[3:])

minuto_inicio = hora_inicio*60
minuto_final = hora_final*60

if minuto_final > minuto_inicio:
    minuto_final-=minuto_inicio
elif minuto_final==minuto_inicio:
    minuto_final-=minuto_inicio
elif minuto_final < minuto_inicio:
    minuto_final=minuto_final - minuto_inicio + 1440

hora_final=int(minuto_final/60)
minuto_final-=(hora_final*60)
print("O tempo de Jogo é",hora_final,":",minuto_final,".")


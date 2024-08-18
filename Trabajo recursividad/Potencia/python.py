
def potencia(x,y):
    """ Dos numeros la base y la potencia, donde seria x elevado a la y """
    return 1 if y<=0 else  x * potencia(x,y-1) 
       
if __name__ == "__main__":
    _base = int(input("Ingrese la base de la potencia: "))
    _potencia = int(input("Ingrese la potencia: "))
    print(f"El resultado es: {potencia(_base,_potencia)}")
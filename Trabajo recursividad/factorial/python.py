
def factorial(x):
    """ Retorna el factorial de x """
    return 1 if x==0 else  x * factorial(x-1) 
       
if __name__ == "__main__":
    _base = int(input("Ingrese el numero para calcular su factorial: "))
    print(f"El resultado es: {factorial(_base)}")
#include <stdio.h>


int potencia(int x, int y){
    if (y==0.0){
        return 1;
    }else{
        return x * potencia(x , y-1);
    }
}

int main(){
    
    int base;
    int exponente;
    int resultado;

    printf("Ingrese la base de la potencia: ");
    scanf("%d",&base);
    printf("Ingrese la potencia: ");
    scanf("%d",&exponente);

    resultado = potencia(base, exponente);
    printf("El resultado de la potencia es: %d", resultado );

    return 0;
}
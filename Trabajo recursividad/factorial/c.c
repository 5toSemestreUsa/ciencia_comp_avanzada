#include <stdio.h>

int factorial(int x){
    if (x==0){
        return 1;
    }else{
        return x * factorial(x-1);
    }
}

int main(){
    int x;
    int result;
    printf("Ingrese el numero para calcular el factorial: ");
    scanf("%d",&x);
    result = factorial(x);

    printf("El resultado es %d" , result);
    return 0;
}
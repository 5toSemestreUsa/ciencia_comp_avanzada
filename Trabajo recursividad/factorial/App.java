import java.util.Scanner;

public class App{

    public static void main(String[] args ) {
       try( Scanner sc =  new Scanner(System.in)){
            System.out.print("Ingrese el numero a calcular su factorial: ");
            int x = sc.nextInt();
            int resultado = factorial(x); 

            System.out.println("El resultado es " + resultado);
        }
    }

    static int factorial(int x){
        if(x==0){
            return 1;
        }
        else{
            return x * factorial(x-1);
        }
    }

}

import java.util.Scanner;

public class App{

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese la base de la potencia: ");
            int base = sc.nextInt();
            
            System.out.print("Ingrese el exponente de la potencia: ");
            int exponente = sc.nextInt();

            int result = potencia(base, exponente);

            System.err.println("El resultado es: " + result);
        }

    }
    
    
    
    
    static int potencia(int x, int y){
        if (y==0.0){
            return 1;
        }else{
            return x * potencia(x , y-1);
        }
    }
}


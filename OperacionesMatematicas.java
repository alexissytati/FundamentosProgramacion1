// Programa para sumar, restar, multiplicar y dividir dos números
import java.util.Scanner;

public class OperacionesMatematicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     int ed;
     System.out.println("Ingrese su edad: ");
     ed = scanner.nextInt();
     if (ed <=12 ){
        System.out.println("Aun eres niño");
     }else if (ed <=17) {
        System.out.println("Eres un adolecente");
        
     }else if (ed >=18){
        System.out.println("Eres un adulto");
     }
     
    }
}


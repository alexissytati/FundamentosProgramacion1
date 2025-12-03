import java.util.Scanner;
public class OperacionesBasicas {
    public static void main(String[] args) {
     Scanner val= new Scanner(System.in);
     System.out.println("¿Cual es tu nombre?");
     String nom = val.nextLine();
     System.out.println("Ingresa su Semestre: ");
     int Sem = val.nextInt();
     System.out.println("¿Cual es tu carrera?");
     String car = val.nextLine();

     System.out.println("Nombre: " + nom +", estudias " + Sem +", la carrera es " + car);

     
    }
}

import java.util.Scanner;
public class HelloWorld {
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  int calificacion;
  System.out.println("Ingrese la calificacion: ");
  calificacion = scanner.nextInt();

  if (calificacion >= 70) {
    System.out.println("Aprobado");
  } else {
    System.out.println("Reprobado");
  }
int n;
int resultado;
System.out.println("Ingrese el numero: ");
n=scanner.nextInt();
for (int i = 1; i <= 10; i++){
    resultado = n * i;
    System.out.println(n + " x " + i + " = " + resultado);

}
String nombre;
int edad;
System.out.println("Ingrese el nombre: ");
nombre=scanner.nextLine();
System.out.println("Ingrese la edad: ");
edad=scanner.nextInt();

  System.out.println("nombre: " +nombre+ " edad: " +edad);

  int bariable;
  Stringe bariable2;

    System.out.println("mensaje para el ususrio: ")
bariable2=scanner.nextLine();
System.out.println("ingrese cualquier numero: ");
bariable=scanner.nextInt();
System.out.println("resultado: " +bariable2+ " "+bariable)


  }

}
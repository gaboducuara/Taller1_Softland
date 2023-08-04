import java.util.Scanner;

//Escribe un programa que pida al usuario un número entero y determine si es par o impar.
public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner  par_impar = new Scanner(System.in);
        System.out.print("Digita un número entero: ");
        int num = par_impar.nextInt();
        if (num % 2 == 0) {
            System.out.println(" ------- A CONTINUACION LAS RESPUESTAS ------- ");
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    }
}

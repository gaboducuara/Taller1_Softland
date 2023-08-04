import java.util.Scanner;

//Realiza un programa que solicite al usuario dos números enteros y determine cuál es el mayor de ellos.
public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner numero_entero = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = numero_entero.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = numero_entero.nextInt();

        int mayorNumero = numero1 > numero2 ? numero1 : numero2;

        if (numero1 == numero2) {
            System.out.println("Ambos números son iguales.");
        } else {
            System.out.println(" ------- A CONTINUACION LA RESPUESTA ------- ");
            System.out.println(mayorNumero + " es el numero mayor.");
        }
    }
}

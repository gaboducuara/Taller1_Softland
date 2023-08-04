import java.util.Scanner;

//Crea un programa que pida al usuario
//una oración y muestre cuántas palabras contiene
public class Ejercicio_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digita una oración: ");
        String oracion = scanner.nextLine();
        scanner.close();

        String[] palabras = oracion.split("\\s+");
        int numero_Palabras = palabras.length;

        System.out.println("La oración tiene " + numero_Palabras + " palabras.");
    }
}

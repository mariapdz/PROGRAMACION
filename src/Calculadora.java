import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
       int numero1 = 0;
       int numero2 = 0;
       String operador = "";


        Scanner entrada = new Scanner(System.in); //variable que se comunica con el teclado
        String seguir = "si";

        while (seguir.equals("si")) {
            System.out.print("Escribe el número: ");
            numero1 = entrada.nextInt();
            entrada.nextLine();

            System.out.print("Escribe la operación(+,-,/,*): ");
            operador = entrada.nextLine();

            System.out.print("Escribe el número: ");
            numero2 = entrada.nextInt();
            entrada.nextLine();


            if (operador.equals("+")) {
                System.out.println(numero1 + numero2);
            } else if (operador.equals("-")) {
                System.out.println(numero1 - numero2);
            } else if (operador.equals("*")) {
                System.out.println(numero1 * numero2);
            } else {
                System.out.println(numero1 / numero2);
            }

            System.out.println("¿Quieres seguir? (si o no): ");
            seguir = entrada.nextLine();
        }
    }
}

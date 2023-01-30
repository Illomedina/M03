
/*primerDarrer: proporciona el primer o el darrer element de la llista
Entrada: llista, opció (primer o darrer)
Sortida: element x
 */
import java.util.Scanner;

public class primerDarrer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Defino el Scanner.
        final int N = 6; // variable, en caso de añadir elementos nuevos tengo que modificar esto.
        int disponibles = 9/3; // Claudio me ha dicho que cuente cuantos elementos hay y los añada a una
        int[][] UF = new int[N][N]; // Creo el Array de tipo String con 6 valores.
        int numero;
        UF[0][0] = 0;
        UF[0][1] = 1;
        UF[0][2] = 2;
        UF[1][0] = 3;
        UF[1][1] = 4;
        UF[1][2] = 5;
        UF[2][0] = 6;
        UF[2][1] = 7;
        UF[2][2] = 8;


        if (disponibles == 0) {
            System.out.println("No hay nada dentro de la array");
        }

        else {
            do { // bucle en el que hago elegir entre 1 2 y 5 para ver el primer o último
                 // elemento y finalizar el programa.
                System.out.println("Pulsa 1 para proporcionar la primera nota o 2 para propocionar la última, en caso de querer salir pulsa 5.");
                numero = scanner.nextInt();
                System.out.println();
                switch (numero) { // Switch para ejecutar el código según la elección.
                    case 1: // Primer nombre
                        System.out.println(UF[0][0]);
                        System.out.println();
                        break;
                    case 2: // Último nombre
                        System.out.println(UF[disponibles-1][disponibles-1]);
                        System.out.println();
                        break;
                    case 5: // En caso de querer finalizar el programa.
                        System.out.println("Finalizando Ejecución....");
                        break;
                    default: // En caso de no ser ninguna opción.
                        System.out.println("Esa no es ninguna opción, vuelve a intentarlo.");
                        System.out.println();
                }
            } while (numero != 5); // Condición con la que el programa se ejecutará hasta que se seleccione 5
        }
    }
}

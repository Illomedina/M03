
/*primerDarrer: proporciona el primer o el darrer element de la llista
Entrada: llista, opció (primer o darrer)
Sortida: element x
 */
import java.util.Scanner;

public class primerDarrer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Defino el Scanner.
        String[] nombres = new String[7]; // Creo el Array de tipo String con 6 valores.
        int disponibles = 6; // Claudio me ha dicho que cuente cuantos elementos hay y los añada a una
                             // variable, en caso de añadir elementos nuevos tengo que modificar esto.
        int numero;

        nombres[0] = "Pere";
        nombres[1] = "Cristian";
        nombres[2] = "Kevin";
        nombres[3] = "Jose";
        nombres[4] = "Maria";
        nombres[5] = "Claudio";

        if (disponibles == 0) {
            System.out.println("No hay nada dentro de la array");
        }

        else {
            do { // bucle en el que hago elegir entre 1 2 y 5 para ver el primer o último
                 // elemento y finalizar el programa.
                System.out.println(
                        "Pulsa 1 para proporcionar el primer nombre o 2 para propocionar el último, en caso de querer salir pulsa 5.");
                numero = scanner.nextInt();
                switch (numero) { // Switch para ejecutar el código según la elección.
                    case 1: // Primer nombre
                        System.out.println(nombres[0]);
                        System.out.println();
                        break;
                    case 2: // Último nombre
                        System.out.println(nombres[disponibles]);
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

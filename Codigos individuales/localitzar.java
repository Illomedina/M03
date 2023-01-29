
/*localitzar: localitza la (primera) posició p en la que es troba un element donat x.
Entrada: element x, llista
Sortida: posició p
 */
import java.util.Scanner;

public class localitzar {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Defino el Scanner.
    int disponibles = 0;
    final int N = 6;
    String[] nombres = new String[N];

    // nombres[0] = "Pere";
    // nombres[1] = "Cristian";
    // nombres[2] = "Kevin";
    // nombres[3] = "Jose";
    // nombres[4] = "Maria";
    // nombres[5] = "Claudio";

    if (disponibles == 0) {
      System.out.println("No hay valores en la array");
    }

    else {

      System.out.print("Introduce el nombre que quieres buscar: ");
      String x = scanner.nextLine();
      System.out.println();
      int i = 0; // Contador

      do { // Bucle para comparar todas las Arrays en busca del nombre introducido.
        if (x.equals(nombres[i])) { // En caso de que la array coincida con el valor introducido hará un break.
          break;
        }
        i++; // Contador para cambiar la posición de la array
        /*
         * Condición para que el bucle no termine hasta que se ejecute 6 veces ya quehay
         * 6 valores.
         */
      } while (i < disponibles);
      /*
       * En caso de i ser menor que 6 significaría que ha encontrado el nombre por lo
       * que digo en que posición ha sido encontrado.
       */
      if (i < disponibles) {
        System.out.print("El nombre introducido se encuentra en la posición " + (i));
      } else { // En caso contrario especificará que el nombre no ha sido encontrado.
        System.out.println("No se ha encontrado el nombre introducido.");
      }
    }
  }
}
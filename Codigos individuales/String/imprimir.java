
/*imprimir: imprimeix tots els elements de la llista del primer a l'últim amb la seva posició
Entrada: llista
Sortida: impressió dels elements de l'array, amb la seva posició, per pantalla.
 */
import java.util.Scanner;

public class imprimir {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Defino el Scanner.
    String[] nombres = new String[7]; // Creo el Array de tipo String con 6 valores.
    int disponibles = 6;
    final int N = 6;// largo de la Array.

    nombres[0] = "Pere";
    nombres[1] = "Cristian";
    nombres[2] = "Kevin";
    nombres[3] = "Jose";
    nombres[4] = "Maria";
    nombres[5] = "Claudio";

    if (disponibles == 0) {
      System.out.println("No hay valores en la array");
    }
    for (int i = 0; i < disponibles; i++) { // Creo un bucle inicializando un contador a 0 y haciendo que se ejecute el
      System.out.println("En la posición " + i + " tenemos el apellido " + nombres[i]); // Imprimo la posición y el
                                                                                        // valor de la array en la
                                                                                        // posicion i
    }
  }
}
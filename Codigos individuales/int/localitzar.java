
/*localitzar: localitza la (primera) posició p en la que es troba un element donat x.
Entrada: element x, llista
Sortida: posició p
 */
import java.util.Scanner;

public class localitzar {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Defino el Scanner.
    int disponibles = 9/3;
    final int N = 6;
    int[][] UF = new int[N][N];
//Hay que pasar estos valores de int a string para seguir usando el mismo código
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
      System.out.println("No hay valores en la array");
    }

    else {

      System.out.print("Introduce la nota que quieres buscar: ");
      int x = scanner.nextInt();
      System.out.println();
      int i = 0; // Contador
      int j;
      do { // Bucle para comparar todas las Arrays en busca del nombre introducido.
        for(j=0; j<disponibles;j++){
            if (x == (UF[i][j])) { // En caso de que la array coincida con el valor introducido hará un break.
                break;
            }
        }
        if (x == (UF[i][j])) { // En caso de que la array coincida con el valor introducido hará un break.
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
        System.out.print("La nota introducida se encuentra en la posición " + (i)+"."+(j));
        System.out.println();
      } else { // En caso contrario especificará que el nombre no ha sido encontrado.
        System.out.println("No se ha encontrado la nota introducida.");
        System.out.println();
      }
    }
  }
}
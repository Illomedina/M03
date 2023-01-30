/* anul_lar.java buidar la llista */

import java.util.Scanner;

public class anular {
  public static void main(String[] args) {
    int disponibles = 6;
    final int N = 6;
    String[] nombres = new String[N];

    nombres[0] = "Pere";
    nombres[1] = "Jose";
    nombres[2] = "Kevin";
    nombres[3] = "Rafel";
    nombres[4] = "Pablo";
    nombres[5] = "ABDULAHH";

    /* Aqui comprovaremos que se han guardado los valores */
    for (int i = 0; i < disponibles; i++) {
      System.out.println(nombres[i]);
    }

    /* Elimina todos los valores de la array y los convierte en null */
    for (int i = 0; i < disponibles; i++) {
      nombres[i] = null;

      /* Si algun elemento de la array ya es nulo que lo ignore */
      if (nombres[i] != null) {
        disponibles--;
      }
    }

    /* Aqui comprovaremos que se han borrado los valores */
    for (int i = 0; i < N; i++) {
      System.out.println(nombres[i]);
    }

    /* Imprimir las posiciones disponibles */
    System.out.println(disponibles);
  }
}
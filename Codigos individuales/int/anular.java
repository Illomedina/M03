import java.util.Scanner;
public class anular {
    /* anul_lar.java buidar la llista */
  public static void main(String[] args) {
    int disponibles = 9;
    final int N = 9;
    int[][][] UF = new int[N];

    UF[0][0][0] = 5;
    UF[0][0][1] = 2;
    UF[0][0][2] = 4;
    UF[0][1][0] = 5;
    UF[0][1][1] = 7;
    UF[0][1][2] = 9;
    UF[0][2][0] = 10;
    UF[0][2][1] = 10;
    UF[0][2][2] = 10;

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
public class anular {
    /* anul_lar.java buidar la llista */
  public static void main(String[] args) {
    int disponibles = 9/3;
    final int N = 9;
    int[][] UF = new int[N][N];

    UF[0][0] = 0;
    UF[0][1] = 1;
    UF[0][2] = 2;
    UF[1][0] = 3;
    UF[1][1] = 4;
    UF[1][2] = 5;
    UF[2][0] = 6;
    UF[2][1] = 7;
    UF[2][2] = 8;

    /* Aqui comprovaremos que se han guardado los valores */
    for (int i = 0; i < disponibles; i++) {
      for (int j=0;j<disponibles;j++){
        System.out.println(UF[i][j]);
        UF[i][j] = 0;

      }
    }

    /* Elimina todos los valores de la array y los convierte en null */
    /*for (int i = 0; i < disponibles; i++) {
      for (int j=0;j<3;j++){
      }*/

      /* Si algun elemento de la array ya es nulo que lo ignore */
      //ESTO CREO QUE NO HACE NADA CON INT
      for (int i = 0; i < disponibles; i++) {
        for (int j=0;j<disponibles;j++){
          if (UF[i][j] != 0) {
            disponibles--;
          }
        }
      }

    /* Aqui comprovaremos que se han borrado los valores */
    for (int i = 0; i < (N/3); i++) {
      for (int j=0;j<3;j++){
        System.out.println(UF[i][j]);
      }
    }

    /* Imprimir las posiciones disponibles */
    System.out.println(disponibles);

  }
}
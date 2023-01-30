public class imprimir {
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
      System.out.println();
      System.out.print("Las notas en la posición "+i+ " son: ");
      for (int j=0;j<disponibles;j++){
        System.out.print(UF[i][j]+" ");
      }
    }
    System.out.println();
  }    
}

/* Demana sobre quina posició volem consultar i imprimeix per pantalla quin cognom hi ha a la posició 
demanada */
import java.util.Scanner;
public class Recuperar {

  public static void main (String[] args) {
        int disponibles = 6;
        final int N = 6;
        String [] nombres = new String[N];
        nombres [0]="aaa";
        nombres [1]="a";
        nombres [2]="ab";
        nombres [3]="aaaaa";
        //nombres [4]="aavda";
        //nombres [5]="aaadwadw";
        Scanner scanner = new Scanner(System.in);
        /* Demana la posició */
        System.out.println("Introdueix quina posició vols consultar");
        int x = scanner.nextInt();

        if(disponibles == 0){
          System.out.println("Aquest Array està buit");
        }
        else{
        /* Imprimeix per pantalla el cognom de la posició demanada*/
        System.out.println("A la posició " + x +" està el valor: ");
        System.out.println(nombres[x]);
        }
  }
}
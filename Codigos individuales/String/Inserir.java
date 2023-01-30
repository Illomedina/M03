/* Permet inserir una cadena de text a una posició determinada que l'usuari vulgui*/
import java.util.Scanner;
public class Inserir {

  public static void main (String[] args) {
        int disponibles = 3;
        final int N = 6;
        String [] nombres = new String[N];
        String valorInserir;
        int posicioInserir;
        nombres [0]="Roca";
        nombres [1]="Febrer";
        nombres [2]="Troncho";
        //nombres [3]="Fàbrega";
        //nombres [4]="Gomez";
        //nombres [5]="Cutar";
        Scanner scanner = new Scanner(System.in);
        if(disponibles == N){
          /* Si no hi ha espais disponibles al Array avisa de que s'eliminarà 
            el contingut de la ultima posició */
          System.out.println("Si introdueixes un nou Cognom eliminaràs l'ultim de la llista!!");
          System.out.println("Introdueix la posició a la qual vols inserir un Cognom");
          posicioInserir = scanner.nextInt();
          /*Demana el nou valor en la posició x */
          System.out.println("Introdueix el cognom que vols inserir");
          valorInserir = scanner.next(); 
          /*Desplaçar cap a la dreta*/
          for (int i = (N-1); i > posicioInserir; i--){
            nombres[i] = nombres[i-1];
          }
          /*Introdueix el nou valor en la posició */
          nombres[posicioInserir] = valorInserir;
          disponibles++;
          }
        else if(disponibles == 0){
          System.out.println("El valor que vas a introduir es posarà en la posioció 0");
          System.out.println("Introdueix el cognom que vols inserir");
          valorInserir = scanner.next();
          nombres[0] = valorInserir;
          disponibles++; 

        }else{
          //Indica quines posicions son disponibles
          System.out.println("Les posicions disponibles que tens per inserir son desde la 0 fins la " + (disponibles));
          //Demana la posició en la que volem introduir el nom
          System.out.println("Introdueix la posició a la qual vols inserir un Cognom");  
          posicioInserir = scanner.nextInt();
          //Comprova que la posició que hem indicat es vàlida
        while(posicioInserir > disponibles){
          //Avisa que la posició que hem posat no es valida
          System.out.println("Aquesta posició no està disponible. Intenta una posició valida");
          //Demana la posició una altra vegada
          posicioInserir = scanner.nextInt();
        }
        //Demana el cogonom a inserir
        System.out.println("Indica el cognom que vols inserir");
          valorInserir = scanner.next();
        if(nombres[posicioInserir] == null){
          nombres[posicioInserir] = valorInserir;
        }else{
          for (int i = disponibles - 1; posicioInserir < i ; i--){
            nombres[i] = nombres[i-1];
          }
        }
        disponibles++;    
        }
        System.out.println("La array te estos cognoms");
        for(int i = 0; i <= N -1; i++){
          System.out.println(nombres[i]);
        }
  }
}
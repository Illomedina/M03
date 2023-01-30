//Este programa elimina un element de una array indicant la posició en el que se troba
import java.util.Scanner;
public class suprimir {

  public static void main (String[] args) {
        int N = 6;
        int disponibles = 4;
        //Declarem l'escaner
        Scanner scanner = new Scanner (System.in);
        //Declarem la array i li fiquem valors manualment
        String [] nombres = new String[N];
        nombres[0] = "aaa";
        nombres[1] = "bbb";
        nombres[2] = "ccc";
        nombres[3] = "ddd";
        //nombres[4] = "eee";
        //nombres[5] = "fff";

        if(disponibles == 0){
            System.out.println("Aquest array està completament buit");
        }

        else{
        //Demanem la posició en la que se troba el valor que volem eliminar
        System.out.println("Quina posició te el element que vols eliminar?");
        int posicioSuprimir = scanner.nextInt();
       
        if(nombres[posicioSuprimir] != null){
        
        for( int i = posicioSuprimir; i < disponibles - 1; i++){
                nombres[i] = nombres[i + 1];
            }
                nombres[disponibles - 1] = null;
                disponibles--;
    }
        else{
            System.out.println("La posició que has indicat ja està buida");

            }
        }
        System.out.println("El array te estos valors:");
        for(int i= 0; i <= N-1; i++){
            System.out.println(nombres[i]);
        }
        System.out.println("Els valors disponibles son els seguents: " + disponibles );
    

  }
}
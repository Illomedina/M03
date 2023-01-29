/*elimina de la llista qualsevol ocurrència de l'element x
Entrada: element x, llista
Sortida: llista
 */
import java.util.Scanner;
public class suprimirDadaBien {
  public static void main (String[] args) {
      Scanner scanner = new Scanner(System.in); //Defino el Scanner.
      String [] nombres = new String[6];  //Creo el Array de tipo String con 6 valores.
      nombres[0] = "Pere";
      nombres[1] = "Cristian";
      nombres[2] = "Kevin";
      nombres[3] = "Cristian";
      nombres[4] = "Maria";
      nombres[5] = "Cristian";
      int disponibles=6;
      if(disponibles == 0){
        System.out.println("Esta array está completamente vacía");        
    }
    System.out.print("Introduce el nombre que quieres buscar: ");
    String x = scanner.nextLine();
    System.out.println();
    int i = 0; //Contador
    for (i=0; i<disponibles; i++){
        if(x.equals(nombres[i])){
            do{ //Bucle para comparar todas las Arrays en busca del nombre introducido.
                if (x.equals(nombres[i])){ //En caso de que la array coincida con el valor introducido hará un break.
                    for( int h = i; h < disponibles - 1; h++){ //h es un contador para este bucle.
                      nombres[h] = nombres[h + 1];
                    }
                      nombres[disponibles - 1] = null;
                      disponibles--;            
                    }
                  i++; //Contador para cambiar la posición de la array
                }
                while (i<disponibles);
            if(disponibles != 0){
                for(int z=0;z<6;z++){
                    System.out.println(nombres[z]);
                }        
            }
        }else{
            System.out.println("El valor introducido no se encuentra en al Array.");
            break;
        }
    }
    


   /* }else{
      do{ //Bucle para comparar todas las Arrays en busca del nombre introducido.
        if (x.equals(nombres[i])){ //En caso de que la array coincida con el valor introducido hará un break.
            for( int h = i; h < disponibles - 1; h++){ //h es un contador para este bucle.
              nombres[h] = nombres[h + 1];
            }
              nombres[disponibles - 1] = null;
              disponibles--;            
            }
          i++; //Contador para cambiar la posición de la array
        }
        while (i<disponibles);
    }
    if(disponibles != 0){
        for(int z=0;z<6;z++){
            System.out.println(nombres[z]);
        }        
    }
     */
}
}
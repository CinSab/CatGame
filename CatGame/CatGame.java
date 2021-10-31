import java.util.*;

public class CatGame{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    System.out.println("Welcome to Cat-Game");
    System.out.println("Type your Cat-name: ");

    Cat gato = new Cat();
    gato.setName(in.nextLine());

    int operacion = 1;

    while ( operacion > 0 && operacion < 5 ){
      System.out.println("Choose an opcion with a number:\n 1. Run \n 2. Jump\n 3. Eat\n 4. Status\n 5. Exit");
      operacion = Integer.parseInt(in.nextLine());
      if (operacion == 1) {
        System.out.println("Ingrese el tiempo en minutos");
        System.out.println(gato.correr(Integer.parseInt(in.nextLine())) + "\n");
      } else if (operacion == 2) {
        System.out.println(gato.saltar() + "\n");
      } else if ( operacion == 3) {
        System.out.println("Ingrese la cantidad de unidades");
        System.out.println(gato.comer(Integer.parseInt(in.nextLine())) + "\n");
      } else if ( operacion == 4) {
        System.out.println(gato.datosCat() + "\n" + gato.obtenerSalto() + "\n");
      }
    }

  }
}

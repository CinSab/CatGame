import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    Random r = new Random();
    int num = r.nextInt(60);

    //Presentación
    System.out.println("+*+* Bienvenido a MeryGochy +*+*");
    //Creacion de MeryGochy
  //  MeryGochy meryGochy = new MeryGochy();
    //Setteo de MeryGochy
    System.out.println("Ingrese color de pelaje: ");
    String colorPelaje = in.nextLine();
    System.out.println("Seleccione especie: (true)Perro / (false)Zorro ");
    boolean especie = in.nextBoolean();

    MeryGochy meryGochy = new MeryGochy(colorPelaje,especie);

    System.out.println("Felicitaciones! Ya tenes a tu MeryGochy! \nStats: ");
    //Incorporar metodo STATS
    System.out.println("La vida de tu "+ meryGochy.getNombre() + " es: " + meryGochy.getVida() + " \nEspecie: " + meryGochy.setEspecie(especie) + " \nColor de pelaje: "+ meryGochy.getColor() + " \nEdad: " + meryGochy.getEdad());

    meryGochy.acariciar(meryGochy.felicidad,meryGochy.social);
    System.out.println("felicidada: " + meryGochy.getFelicidad() + " social:"+ meryGochy.getSocial());

    //System.out.println(meryGochy.isAliveResponse(meryGochy.isAlive));

    Alimento cerdo = new Alimento(num);
    System.out.println(meryGochy.comer(meryGochy.peso, cerdo.peso));
    System.out.println("La vida de tu "+ meryGochy.getNombre() + " es: " + meryGochy.getVida() + " \nEspecie: " + meryGochy.setEspecie(especie) + " \nPeso: "+ meryGochy.getPeso() + " \nEdad: " + meryGochy.getEdad());


    //Menu de acciones:
  /*  System.out.println("Menu: \n1) Ver stats de tu MeryGochy \n2) Alimentar MeryGochy \n3) Baniar MeryGochy \n4) Pasear MeryGochy \n5) Descansar MeryGochy");
    System.out.println("Seleccione opcion: ");
    int opcionMenu = in.nextInt();*/
    //meryGochy.edad = 14;

  //  meryGochy.comer(mascota.peso, 20);
  //  System.out.println("La vida de tu "+ meryGochy.getNombre() + " es " + meryGochy.getVida() + " \nEspecie: " + meryGochy.setEspecie(especie) + " \nColor de pelaje: "+ meryGochy.getColor());

  }
}

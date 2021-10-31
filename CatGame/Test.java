import java.util.*;

public class Test{
  public static void testComidaCorrerSaltar(){
        Cat tom = new Cat();
        tom.setName("TestCat1");

        System.out.println("Energia inicial: "+ tom.datosCat());
        System.out.println(tom.comer(10));
        System.out.println("Energia, luego de comer 10 unidades: "+ tom.datosCat());
        System.out.println(tom.comer(10));
        System.out.println(tom.datosCat());
        System.out.println(tom.comer(3));
        System.out.println(tom.datosCat());
        System.out.println(tom.comer(40));
        System.out.println(tom.datosCat());
        System.out.println(tom.correr(10));
        System.out.println(tom.datosCat());
        System.out.println(tom.correr(1));
        System.out.println(tom.datosCat());
        System.out.println(tom.correr(40));
        System.out.println(tom.datosCat());
        System.out.println(tom.saltar());
        System.out.println(tom.datosCat());
        System.out.println(tom.saltar());
        System.out.println(tom.datosCat());
        System.out.println(tom.saltar());
        System.out.println("Energia "+ tom.datosCat());
        System.out.println(tom.saltar());
        System.out.println("Energia final "+ tom.datosCat());
      }


    public static void testObtenerSaltos(){
      Scanner in = new Scanner(System.in);
      Cat catTest = new Cat();
      catTest.setName("TestCat2");

      System.out.println("Energia inicial: "+ catTest.datosCat());
      System.out.println("Ingresa unidad de comida: ");
      int uniComida = in.nextInt();
      System.out.println(catTest.comer(uniComida));
      System.out.println("Energia, luego de comer "+ uniComida+" unidades: "+ catTest.datosCat());
      System.out.println(catTest.obtenerSalto());
    }

}

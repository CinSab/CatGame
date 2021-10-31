public class MeryGochy{
  final private String nombre = "MeryGochy";
  final private String color;
  //final private boolean especie;
  private int edad = 0; // Nace con 0 || edad++ if (hora de juego)++- || no tiene limite
  private int vida = 100; // Nace con esta vida || 0 == isDead || No pasa + de 100
   float peso = 1f; // Nace ocn 1kg || Si llega a 100 explota y muere || peso >= 50 => (vida-- x hora de juego?)
   int felicidad = 100; // Nace con 100 || felicidad <= 50 => (vida-- X hora de juego) ||
   int social = 100;  // Nace con 100  ||   social +20 x c/ Acariciar
   boolean isAlive = true;
//  private boolean especie; //(TRUE == perro | FALSE == zorro)
  private static MeryGochy MERYGOCHY;

  public int getEdad(){ //Crear metodo para envejecer (si llega a 25 muere)
    return edad;
  }

  public int getVida(){ //Crear metodo para aumentar y descendeer peso (Si llega a 0 muere y tope de 100)
    return vida;
  }

  public String getNombre(){ return nombre; }
  public String getColor(){ return color; }
  public int getSocial(){ return social; }
  public int getFelicidad(){ return felicidad;}
  public float getPeso(){ return peso;}
  /*public boolean getIsAlive(){ return isAlive;}

  public void setIsAlive(boolean isAlive){ this.isAlive = isAlive;}*/

  //Metodo Acariciar sube feicidad
  public void acariciar(int felicidad, int social ){
      this.felicidad = felicidad + 20;
      this.social = social + 20;
  }

  public MeryGochy(String color, boolean especie){
    this.color = color;
    setEspecie(especie);
  }

  public String setEspecie(boolean especie){
    return especie?  "Perro":"Zorro";
  }

  public String comer(float peso, float alimento){
      float aumentarPeso = this.peso + alimento;
      this.peso = aumentarPeso;
    //  isFat(this.peso);
      return this.isAliveResponse();
    //  comerSalud(cantidad);
    }
    public boolean isFat(){
        return this.getPeso() > 50 ? !isAlive : isAlive;
      }
  public boolean isAlive(){
    return this.getVida() > 0 && this.getVida() <= 100 && this.isFat() ? isAlive : !isAlive;
  }
  public String isAliveResponse(){
    //return this.isAlive() ? "MeryGochy Sigue con vida!" : "Mataste a tu MeryGochy, Restart?";
    if(this.isAlive() == false){
      if(this.isFat() == false){
        return "EXPLOTASTE A TU MERYGOCHY!!!, Restart?";
      }else{
        return "Mataste a tu MeryGochy, Restart?";
      }
    }else{
      return "MeryGochy Sigue con vida!";
    }



  }
  //Reearmar para contruir el boton restart game y validacion de total de vida(isAlive or isDead)
  /*public static MeryGochy startGame(){
    if(MERYGOCHY == null){
        MERYGOCHY =  new MeryGochy("Dora3", true);
    }
    return MERYGOCHY;
  }*/
}

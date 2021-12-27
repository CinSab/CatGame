public class Cat{
  private String name;
  private int energia;

  final private int ENERGIA_SALTO = 3;
  final private int MAX_ENERGIA_COMIDA = 10;

  public String getName(){ return name; }
  public void setName(String name){ this.name = name; }
  private int getEnergia(){ return energia; }
  private void setEnergia(int energia){ this.energia = energia; }

  //Mtodos relacionados a Saltar:
  public String saltar(){
    if(sePuedeSaltar(getEnergia())){
      setEnergia(restaSalto(getEnergia()));
      return "Soy " + getName() + ", salte y gaste 3 unidades.";
    }else{
      return "Soy " + getName() + ", no tengo energia para saltar.";
    }
  }

  private int restaSalto(int energia){
    /*int energiaSalto = getEnergia() - ENERGIA_SALTO;
    return energiaSalto;*/
    return energia - ENERGIA_SALTO;
  }
  private boolean sePuedeSaltar(int energia){
    return energia >= ENERGIA_SALTO;
  }

  public String obtenerSalto(){
    int cantSaltos = 0;
    int energiaCalculada = getEnergia();
    if(sePuedeSaltar(energiaCalculada)){
      for(int i = 0; energiaCalculada > 2 ; i++){
        energiaCalculada = restaSalto(energiaCalculada);
        cantSaltos++;
      }
      return "Cantidad de saltos disponibes: " + cantSaltos;
    }else{
      return "No podes realizar ningun salto, podes comer para cargarte la energia";
    }
  }

//Metodos relacionados a Correr
  public String correr(int minutos){
    //minuto - 1 energia
    if(getEnergia() >= minutos){
      int energiaCorrer = getEnergia() - minutos;
      setEnergia(energiaCorrer);
      return minutos > 1? "Soy " + getName() + ", corri " + minutos + " minutos." : minutos == 1 ? "Soy " + getName() + ", corri " + minutos + " minuto." : "Ponle que corri 0 minutos";
    }else{
      return minutos > 1? "Soy " + getName() + ", no tengo energia suficiente para correr " + minutos + " minutos." : "Soy " + getName() + " no tengo energia suficiente para correr " + minutos + " minuto.";
    }
  }

//Metodo comer:
  public String comer(int unidadesDeComida){
    //Optimizar algoritmo
    int energiaPosibe;
    int cantidadDeComida;
    if(unidadesDeComida <= MAX_ENERGIA_COMIDA && getEnergia() < MAX_ENERGIA_COMIDA){
      energiaPosibe = MAX_ENERGIA_COMIDA - getEnergia();
      cantidadDeComida = getEnergia() + unidadesDeComida;
      if(cantidadDeComida <= MAX_ENERGIA_COMIDA){
        setEnergia(cantidadDeComida);
        return "Soy " + getName() + ", comi " + unidadesDeComida + " unidades.";
      }else{
        return "Soy " + getName() + ", no pudedo comer mas de " + energiaPosibe;
      }
    }else{
      if(getEnergia() >= MAX_ENERGIA_COMIDA && unidadesDeComida <= MAX_ENERGIA_COMIDA){
        return "No puedo tener mas de 10 unidades de comida.";
      }else{
        return "No puedo comer mas de 10 unidades de comida.";
      }
    }
  }

//Metodo Datos del Cat();
@Override
  public String toString(){
    return "Soy " + getName() + ", me quedan " + getEnergia() + " unidades de Energia.";
  }
}

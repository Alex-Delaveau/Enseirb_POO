
public class Porte {

  PorteCharniere porteCharniere;
  PorteCoulissante porteCoulissante;

  private Porte(PorteCharniere porte){
    this.porteCharniere = porte;
  }

  private Porte(PorteCoulissante porte){
    this.porteCoulissante = porte;
  }

  public static Porte creerPorteCharniere(){
    return new Porte(new PorteCharniere());
  }

  public static Porte creerPorteCoulissante(int pasMax){
    return new Porte(new PorteCoulissante(pasMax));
  }

  public boolean estFerme() {
    return false;
  }

  public void fermer() {
    if(porteCharniere != null){
      porteCharniere.fermer();
    }
    if(porteCoulissante != null){
      porteCoulissante.fermer();
    }
  }

  public void ouvrir() {
    if(porteCharniere != null){
      porteCharniere.ouvrir();
    }
    if(porteCoulissante != null){
      porteCoulissante.ouvrir();
    }
  }
}


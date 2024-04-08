
class PorteVerrouCoulissante extends PorteCoulissante {

  private boolean estDeVerrouille; //Default value false.
  
  public PorteVerrouCoulissante(int pasMax) {
    super(pasMax);
    estDeVerrouille = true;
  }
  
  public void verrouiller() {
    estDeVerrouille = false;
  }
  
  public void deverrouiller() {
    estDeVerrouille = true;
  }
  
  public boolean estVerrouille() {
    return !estDeVerrouille;
  }

  public void ouvrir() {
    if (estDeVerrouille)
      super.ouvrir();
  }
}

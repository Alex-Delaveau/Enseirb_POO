class PorteVerrouCharniere extends PorteCharniere {
  
  private boolean estDeVerrouille;
  
  public PorteVerrouCharniere() {
    super();
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

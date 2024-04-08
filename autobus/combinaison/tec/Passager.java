package autobus.combinaison.tec;


public interface Passager {

  //methods
  String nom();
 
  boolean estDehors();
 
  boolean estAssis();
 
  boolean estDebout();
 
  void changerEnDehors();
 
  void changerEnAssis();
 
  void changerEnDebout();

  void nouvelArret(DemandeArret v, int numeroArret);
}

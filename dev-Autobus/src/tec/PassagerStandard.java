package tec;

public class PassagerStandard {
  // attributs
    private String nom;
    private int destination;
    private Position position;
 
  // constructor
  public PassagerStandard(String nom, int destination) {
    this.nom = nom;
    this.destination = destination;
    this.position = Position.creer();
  }
 
  //methods
  public String nom() {
    return this.nom;
  }
 
  public boolean estDehors() {
    return this.position.estDehors();
  }
 
  public boolean estAssis() {
    return this.position.estAssis();
  }
 
  public boolean estDebout() {
    return  this.position.estDebout();
  }
 
  public void changerEnDehors() {
    this.position = Position.creer();
  }
 
  public void changerEnAssis() {
    this.position = Position.assis();
  }
 
  public void changerEnDebout() {
    this.position = Position.debout();
  }
 
  public void monterDans(Autobus t) {
    if(!this.estDehors()){
      System.out.println("Deja dans un bus");
      return;
    }

    if (t.aPlaceAssise()) {
      t.monteeDemanderAssis(this);
    } else if (t.aPlaceDebout()) {
      t.monteeDemanderDebout(this);
    }
  }
 
  public void nouvelArret(Autobus t, int numeroArret) {
    if (this.destination == numeroArret) {
      t.arretDemanderSortie(this);
    }
  }

  @Override
  public String toString() {
    return nom + ' ' + position;
  }
 } 
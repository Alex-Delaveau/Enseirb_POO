package autobus.heritage.tec;

abstract class FactoPassager implements Passager, Usager {

    private String nom;
    private int destination;
    private Position position;

    public FactoPassager(String nom, int destination) {
        this.nom = nom;
        this.destination = destination;
        this.position = Position.creer();
    }

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
        return this.position.estDebout();
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
    final protected void debout(DemandeMontee b){
        if(b.aPlaceDebout()){
            b.monteeDemanderDebout(this);        
        }

    }
    final protected void assis(DemandeMontee b){
        if(b.aPlaceAssise()){
            b.monteeDemanderAssis(this);
        }
    }
    final protected void deboutAssis(Autobus b){
        if(b.aPlaceDebout()){
            b.monteeDemanderAssis(this);
        }
        else if(b.aPlaceAssise()){
            b.monteeDemanderDebout(this);
        }

    }
    final protected void Assisdebout(Autobus b){
        if(b.aPlaceAssise()){
            b.monteeDemanderAssis(this);
        }
        else if(b.aPlaceDebout()){
            b.monteeDemanderDebout(this);
        }
    }

    public int getDestination() {
        return destination;
    }

    @Override
    public String toString() {
        return nom + ' ' + position;
    }

}
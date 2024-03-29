package autobus.heritage.tec;

class PassagerStandard implements Passager, Usager {

    private String nom;
    private int destination;
    private Position position;

    public PassagerStandard(String nom, int destination) {
        this.nom = nom;
        this.destination = destination;
        this.position = Position.creer();
    }

    @Override
    public String nom() {
        return this.nom;
    }

    @Override
    public boolean estDehors() {
        return this.position.estDehors();
    }

    @Override
    public boolean estAssis() {
        return this.position.estAssis();
    }

    @Override
    public boolean estDebout() {
        return this.position.estDebout();
    }

    @Override
    public void changerEnDehors() {
        this.position = Position.creer();
    }

    @Override
    public void changerEnAssis() {
        this.position = Position.assis();
    }

    @Override
    public void changerEnDebout() {
        this.position = Position.debout();
    }

    @Override
    public void monterDans(Autobus t) {
        if (!this.estDehors()) {
            System.out.println("Deja dans un bus");
            return;
        }

        if (t.aPlaceAssise()) {
            t.monteeDemanderAssis(this);
        } else if (t.aPlaceDebout()) {
            t.monteeDemanderDebout(this);
        }
    }

    @Override
    public void nouvelArret(DemandeArret t, int numeroArret) {
        if (this.destination == numeroArret) {
            t.arretDemanderSortie(this);
        }
    }

    @Override
    public String toString() {
        return nom + ' ' + position;
    }

}

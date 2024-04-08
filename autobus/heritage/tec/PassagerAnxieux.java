package autobus.heritage.tec;

class PassagerAnxieux extends FactoPassager{

    public PassagerAnxieux(String nom, int destination) {
        super(nom, destination);
    }
    @Override
    public void monterDans(Transport p) {
        if (!this.estDehors()) {
            System.out.println("Deja dans un bus");
            return;
        }

        DemandeMontee t = (DemandeMontee) p;

        if (t.aPlaceDebout()) {
            t.monteeDemanderDebout(this);
        } else {
            System.out.println("Pas de place debout le passager anxieux ne monte pas dans le bus");
            return;
        }
    }

    // @Override
    // public void nouvelArret(DemandeArret t, int numeroArret) {
    //     if (this.getDestination() == numeroArret - 1) {
    //         super.sortir(t, numeroArret);
    //     }
    // }

    @Override
    protected void choixNouvelArret(DemandeArret bus, int distanceDestination) {
        if (super.sortir(bus, distanceDestination)) {
            return;
        }
        if (distanceDestination == 1) {
            this.changerEnDebout();
        }
    }
}

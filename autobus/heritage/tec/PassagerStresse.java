package autobus.heritage.tec;

class PassagerStresse extends FactoPassager{
    
    private int destination;

    public PassagerStresse(String nom, int destination) {
        super(nom, destination);
        this.destination = destination;
    }


    @Override
    public void monterDans(Transport p) {
        if (!this.estDehors()) {
            System.out.println("Deja dans un bus");
            return;
        }

        DemandeMontee t = (DemandeMontee) p;

        if (t.aPlaceAssise()) {
            t.monteeDemanderAssis(this);
        } else {
            System.out.println("Pas de place assise le passager stressé ne monte pas dans le bus");
            return;
        }
    }

    // @Override
    // public void nouvelArret(DemandeArret t, int numeroArret) {
    //     if (this.destination == numeroArret - 3 && t.aPlaceDebout()) {
    //         this.changerEnDebout();
    //     }
    //     super.sortir(t, numeroArret);
    // }

    @Override
    protected void choixNouvelArret(DemandeArret bus, int distanceDestination) {
        if (super.sortir(bus, distanceDestination)) {
            return;
        }
        if (distanceDestination == 3 && bus.aPlaceDebout()) {
            this.changerEnDebout();
        }
    }
    
}

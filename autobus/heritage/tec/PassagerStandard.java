package autobus.heritage.tec;

class PassagerStandard extends FactoPassager {



    public PassagerStandard(String nom, int destination) {
        super(nom, destination);
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
        } else if (t.aPlaceDebout()) {
            t.monteeDemanderDebout(this);
        }
    }
    
    @Override
    protected void choixNouvelArret(DemandeArret bus, int distanceDestination) {
        this.sortir(bus, distanceDestination);
    }
    

}

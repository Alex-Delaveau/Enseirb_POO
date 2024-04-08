package autobus.heritage.tec;

public class PassagerLunatique extends FactoPassager {


    public PassagerLunatique(String nom, int destination) {
        super(nom, destination);
    }
    

    // @Override
    // public void nouvelArret(DemandeArret t, int numeroArret) {
    //     if (this.estAssis()) {
    //         this.changerEnDebout();
    //     } else {
    //         this.changerEnAssis();
    //     }
    //     super.sortir(t, numeroArret);
    // }



    @Override
    public void monterDans(Transport t) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'monterDans'");
    }


    @Override
    protected void choixNouvelArret(DemandeArret bus, int distanceDestination) {
        if (super.sortir(bus, distanceDestination)) {
            return;
        }

        if (this.estAssis()) {
            this.changerEnDebout();
        } else {
            this.changerEnAssis();
        }
    }


}

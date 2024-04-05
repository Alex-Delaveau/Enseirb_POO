package autobus.heritage.tec;

public class PassagerLunatique extends PassagerStandard {


    public PassagerLunatique(String nom, int destination) {
        super(nom, destination);
    }
    

    @Override
    public void nouvelArret(DemandeArret t, int numeroArret) {
        if (this.estAssis()) {
            this.changerEnDebout();
        } else {
            this.changerEnAssis();
        }
        super.nouvelArret(t, numeroArret);
    }
}

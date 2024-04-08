package autobus.combinaison.tec;

import autobus.combinaison.tec.Arret.Arret;
import autobus.combinaison.tec.Monter.Monter;


public abstract class FactoPassager implements Passager, Usager{

    private String nom;
    private int destination;
    private Position position;
    private Arret arret;
    private Monter monter;

    public FactoPassager(String nom, int destination,Monter monter, Arret arret ){
        this.nom = nom;
        this.destination = destination;
        this.arret = arret;
        this.monter = monter;
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

    public int getDestination() {
        return destination;
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

    final public void monterDebout(DemandeMonter b) {
        if (b.aPlaceDebout()) {
            b.monteeDemanderDebout(this);
        }

    }

    final public void monterAssis(DemandeMonter b) {
        if (b.aPlaceAssise()) {
            b.monteeDemanderAssis(this);
        }
    }

    final public void monterDeboutPuisAssis(Autobus b) {
        if (b.aPlaceDebout()) {
            b.monteeDemanderAssis(this);
        } else if (b.aPlaceAssise()) {
            b.monteeDemanderDebout(this);
        }

    }

    final public void monterAssisPuitDebout(Autobus b) {
        if (b.aPlaceAssise()) {
            b.monteeDemanderAssis(this);
        } else if (b.aPlaceDebout()) {
            b.monteeDemanderDebout(this);
        }
    }

    final boolean sortir(DemandeArret b, int numeroArret) {
        if (this.destination == numeroArret) {
            b.arretDemanderSortie(this);
            return true;
        }
        return false;
    }

    @Override
    final public void nouvelArret(DemandeArret v, int numeroArret) {
        arret.choixNouvelArret(v, numeroArret - this.getDestination(), this);
    }

    @Override
    final public void monterDans(Transport t) {
        monter.monterDans(t, this);
    }

    @Override
    public String toString() {
        return nom + ' ' + position;
    }
}

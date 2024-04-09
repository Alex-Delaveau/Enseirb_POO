package autobus.combinaison.tec.Arret;

import autobus.combinaison.tec.DemandeArret;
import autobus.combinaison.tec.FactoPassager;

public class ArretSportif implements Arret{

    @Override
    public void choixNouvelArret(DemandeArret v, int numeroArret, FactoPassager fp) {
        //demande à sortir un arrêt avant sa destination.
        if (fp.getDestination() - numeroArret <= 1) {
            fp.sortir(v, numeroArret);
        }
    }

}

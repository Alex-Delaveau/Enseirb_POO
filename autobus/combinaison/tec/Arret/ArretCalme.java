package autobus.combinaison.tec.Arret;

import autobus.combinaison.tec.DemandeArret;
import autobus.combinaison.tec.FactoPassager;

public class ArretCalme implements Arret{

    @Override
    public void choixNouvelArret(DemandeArret v, int numeroArret, FactoPassager fp) {
        //ne pas changer de place ;
        fp.sortir(v, numeroArret);
    }
    
}

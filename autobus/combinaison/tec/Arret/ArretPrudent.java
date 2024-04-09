package autobus.combinaison.tec.Arret;

import autobus.combinaison.tec.DemandeArret;
import autobus.combinaison.tec.FactoPassager;

public class ArretPrudent implements Arret{

    @Override
    public void choixNouvelArret(DemandeArret v, int numeroArret, FactoPassager fp) {
        //à partir de trois arrêt de sa destination, demande une place debout ;
        if(fp.getDestination() - numeroArret <= 3){
            v.arretDemanderDebout(fp);
        }

        fp.sortir(v, numeroArret);
    }
    
}

package autobus.combinaison.tec.Arret;

import autobus.combinaison.tec.DemandeArret;
import autobus.combinaison.tec.FactoPassager;

public class ArretAgoraphobe implements Arret {

    @Override
    public void choixNouvelArret(DemandeArret v, int numeroArret, FactoPassager fp) {
        //demande à sortir si le bus n’a plus de place assise ou de place debout ;
        if (!v.aPlaceAssise() && !v.aPlaceDebout()) {
            v.arretDemanderSortie(fp);
        }
        fp.sortir(v, numeroArret);
    }

}
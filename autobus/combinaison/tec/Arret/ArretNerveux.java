package autobus.combinaison.tec.Arret;

import autobus.combinaison.tec.DemandeArret;
import autobus.combinaison.tec.FactoPassager;

public class ArretNerveux implements Arret{

    @Override
    public void choixNouvelArret(DemandeArret v, int numeroArret, FactoPassager fp) {
        //changer de place à chaque arrêté ;
        if(fp.estAssis()){
            v.arretDemanderDebout(fp);
        } else if (fp.estDebout()){
            v.arretDemanderAssis(fp);
        }

        fp.sortir(v, numeroArret);
    }
    
}

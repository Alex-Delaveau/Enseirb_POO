package autobus.combinaison.tec.Monter;

import autobus.combinaison.tec.DemandeMonter;
import autobus.combinaison.tec.FactoPassager;
import autobus.combinaison.tec.Transport;

public class MonterRepos implements Monter{

    @Override
    public void monterDans(Transport t, FactoPassager fp) {
        DemandeMonter dm = (DemandeMonter) t;
        if(dm.aPlaceAssise()){
            fp.monterAssis(dm);
        } else if (dm.aPlaceDebout()) {
            fp.monterDebout(dm);
        } else {
            return;
        }
    }
    
}

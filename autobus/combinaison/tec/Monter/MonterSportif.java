package autobus.combinaison.tec.Monter;

import autobus.combinaison.tec.DemandeMonter;
import autobus.combinaison.tec.FactoPassager;
import autobus.combinaison.tec.Transport;

public class MonterSportif implements Monter{

    @Override
    public void monterDans(Transport t, FactoPassager fp) {
        // prendre une place de debout sinon rester dehors.
        DemandeMonter dm = (DemandeMonter) t;
        if(dm.aPlaceDebout()){
            fp.monterDebout(dm);
        }
        return;
    }
    
}

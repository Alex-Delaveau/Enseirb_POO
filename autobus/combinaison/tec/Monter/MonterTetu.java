package autobus.combinaison.tec.Monter;

import autobus.combinaison.tec.DemandeMonter;
import autobus.combinaison.tec.FactoPassager;
import autobus.combinaison.tec.Transport;

public class MonterTetu implements Monter{

    @Override
    public void monterDans(Transport t, FactoPassager fp) {
        //prendre une place debout même si le bus est plein ;
        DemandeMonter dm = (DemandeMonter) t;
        fp.monterDebout(dm);
    }
    
}

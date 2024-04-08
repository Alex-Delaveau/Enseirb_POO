package autobus.combinaison.tec;

import autobus.combinaison.tec.Arret.Arret;
import autobus.combinaison.tec.Monter.Monter;

public class PassagerCombinaison extends FactoPassager {
    
       
    public PassagerCombinaison(String nom, int destionation, Monter monter, Arret arret){
        super(nom, destionation,monter, arret);
    }

    
}

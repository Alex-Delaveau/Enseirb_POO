package autobus.combinaison.tec.Arret;

import autobus.combinaison.tec.DemandeArret;
import autobus.combinaison.tec.FactoPassager;

public interface Arret {
    public void choixNouvelArret(DemandeArret v, int numeroArret, FactoPassager fp);
}

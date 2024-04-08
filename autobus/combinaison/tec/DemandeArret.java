package autobus.combinaison.tec;

public interface DemandeArret {
    void arretDemanderAssis(Passager p);
    void arretDemanderDebout(Passager p);
    void arretDemanderSortie(Passager p);
    boolean aPlaceAssise();
    boolean aPlaceDebout();   
}

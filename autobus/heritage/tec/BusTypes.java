package autobus.heritage.tec;

interface DemandeArret {

    void arretDemanderAssis(Passager p);
    void arretDemanderDebout(Passager p);
    void arretDemanderSortie(Passager p);
    boolean aPlaceAssise();
    boolean aPlaceDebout();
    
}


interface DemandeMontee {
    void monteeDemanderAssis(Passager p);
    boolean aPlaceDebout();
    boolean aPlaceAssise();
    void monteeDemanderDebout(Passager p);
}
package autobus.combinaison.tec;

public interface Transport{
    void allerArretSuivant();
}

interface DemandeMontee {
    void monteeDemanderAssis(Passager p);
    boolean aPlaceDebout();
    boolean aPlaceAssise();
    void monteeDemanderDebout(Passager p);
}

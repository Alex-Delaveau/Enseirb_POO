package autobus.combinaison.tec;

public interface DemandeMonter {
    void monteeDemanderAssis(Passager p);
    boolean aPlaceDebout();
    boolean aPlaceAssise();
    void monteeDemanderDebout(Passager p);
}
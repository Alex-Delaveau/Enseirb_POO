package autobus.heritage.tec;

public class PassagerFactory {
    

    public static PassagerStandard createPassagerStandard(String nom, int destination) {
        return new PassagerStandard(nom, destination);
    }

    public static PassagerStresse createPassagerStresse(String nom, int destination) {
        return new PassagerStresse(nom, destination);
    }

    public static PassagerAnxieux createPassagerAnxieux(String nom, int destination) {
        return new PassagerAnxieux(nom, destination);
    }
    
}

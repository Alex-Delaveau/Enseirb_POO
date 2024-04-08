package autobus.combinaison.tec;

import autobus.combinaison.tec.Arret.*;
import autobus.combinaison.tec.Monter.*;

public class PassagerFactory {
    
    public static PassagerCombinaison createPassagerCombinaison(String nom, int destination, Monter monter, Arret arret){
        return new PassagerCombinaison(nom, destination, monter, arret);
    }
    
    public static PassagerCombinaison createPassagerStandard(String nom, int destination){
        return createPassagerCombinaison(nom, destination, new MonterRepos(), new ArretCalme());
    }

    public static PassagerCombinaison createPassagerStresse(String nom, int destination) {
        return createPassagerCombinaison(nom, destination, new MonterFatigue(), new ArretPrudent());
    }

    public static PassagerCombinaison createPassagerAnxieux(String nom, int destination) {
        return createPassagerCombinaison(nom, destination, new MonterSportif(), new ArretSportif());
    }

    public static PassagerCombinaison createPassagerLunatique(String nom, int destination) {
        return createPassagerCombinaison(nom, destination, new MonterRepos(), new ArretNerveux());
    }
}

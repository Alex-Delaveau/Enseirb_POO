package autobus.heritage;

import autobus.heritage.tec.PassagerAnxieux;
import autobus.heritage.tec.PassagerStresse;
import autobus.heritage.tec.Usager;
import autobus.heritage.tec.Autobus;

public class NouveauSimple {
    public static void main(String[] args) {
        Autobus serenity = new Autobus(1, 2);
        Usager zoe = new PassagerAnxieux("Zoe", 3);
        Usager wash = new PassagerStresse("Wash", 4);


        System.out.println(serenity);


        serenity.allerArretSuivant();
        zoe.monterDans(serenity);


        System.out.println(serenity);
        System.out.println(zoe);


        serenity.allerArretSuivant();
        wash.monterDans(serenity);


        System.out.println(serenity);
        System.out.println(zoe);
        System.out.println(wash);


        // Etc…
    }

}

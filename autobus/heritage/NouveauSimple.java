package autobus.heritage;

import autobus.heritage.tec.Usager;
import autobus.heritage.tec.Autobus;
import autobus.heritage.tec.PassagerFactory;

public class NouveauSimple {
    public static void main(String[] args) {
        Autobus serenity = new Autobus(1, 2);
        Usager zoe = PassagerFactory.createPassagerAnxieux("Zoe", 3);
        Usager wash = PassagerFactory.createPassagerStresse("Wash", 4);


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

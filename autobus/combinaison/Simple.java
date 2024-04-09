package autobus.combinaison;

import autobus.combinaison.tec.Autobus;
import autobus.combinaison.tec.PassagerFactory;
import autobus.combinaison.tec.Transport;
import autobus.combinaison.tec.Usager;

public class Simple {

    static public void main(String[] args) {
        Transport serenity = new Autobus(1, 2);

        // Standard
        Usager kaylee = PassagerFactory.createPassagerStandard("Kayle", 3);
        // Anxieux
        Usager jayne = PassagerFactory.createPassagerAnxieux("Jayne", 4);
        // Stresse
        Usager inara = PassagerFactory.createPassagerStresse("Inara", 5);


        System.out.println(serenity);

        serenity.allerArretSuivant();
        // 1
        inara.monterDans(serenity);
        kaylee.monterDans(serenity);

        System.out.println(serenity);
        System.out.println(kaylee);

        serenity.allerArretSuivant();
        // 2
        jayne.monterDans(serenity);

        System.out.println(serenity);
        System.out.println(kaylee);
        System.out.println(jayne);

        serenity.allerArretSuivant();
        // 3
        inara.monterDans(serenity);

        System.out.println(serenity);
        System.out.println(kaylee);
        System.out.println(jayne);
        System.out.println(inara);

        serenity.allerArretSuivant();
        // 4
        System.out.println(serenity);
        System.out.println(kaylee);
        System.out.println(jayne);
        System.out.println(inara);

        serenity.allerArretSuivant();
        // 5
        System.out.println(serenity);
        System.out.println(kaylee);
        System.out.println(jayne);
        System.out.println(inara);
    }

}

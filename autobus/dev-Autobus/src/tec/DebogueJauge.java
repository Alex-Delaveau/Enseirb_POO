package tec;
public class DebogueJauge {
    public static void main(String[] args) {
        DebogueJauge djcas1 = new DebogueJauge();
        djcas1.testDansIntervalle();
        System.out.println("--------------------");
        new DebogueJauge().testAuDessusIntervalle();
        System.out.println("--------------------");
        DebogueJauge djcas3 = new DebogueJauge();
        djcas3.testAuDessusIntervallePuisDecrementer();
        System.out.println("--------------------");
        DebogueJauge djcas4 = new DebogueJauge();
        djcas4.testAuDessusIntervallePuisIncrementer();
        System.out.println("--------------------");
    }
    void testDansIntervalle() {
        System.out.println("Valeur de depart dans l'intervalle");
        Jauge jauge = new Jauge(10,3);
        System.out.println(jauge.toString());
        boolean estRouge = jauge.estRouge();
        boolean estVert = jauge.estVert();
        System.out.println("Jauge est rouge : " + jauge.estRouge());
        System.out.println("Jauge est verte : " + jauge.estVert());

        if(!estRouge && estVert) {
            System.out.println("OK");
        } else {
            System.out.println("KO");
        }
    }
    void testAuDessusIntervalle(){
        System.out.println("Valeur de depart au dessus de l'intervalle");
        Jauge jauge = new Jauge(10,13);
        System.out.println(jauge.toString());
        boolean estRouge = jauge.estRouge();
        boolean estVert = jauge.estVert();
        System.out.println("Jauge est rouge : " + jauge.estRouge());
        System.out.println("Jauge est verte : " + jauge.estVert());

        if(estRouge && !estVert) {
            System.out.println("OK");
        } else {
            System.out.println("KO");
        }
    }
    void testAuDessusIntervallePuisDecrementer(){
        System.out.println("Valeur de depart au dessus de l'intervalle puis décrémenter");
        Jauge jauge = new Jauge(10,13);
        System.out.println(jauge.toString());
        jauge.decrementer();
        System.out.println(jauge.toString());
        boolean estRouge = jauge.estRouge();
        boolean estVert = jauge.estVert();
        System.out.println("Jauge est rouge : " + jauge.estRouge());
        System.out.println("Jauge est verte : " + jauge.estVert());

        if(!estRouge && estVert) {
            System.out.println("OK");
        } else {
            System.out.println("KO");
        }
    }
    void testAuDessusIntervallePuisIncrementer(){
        System.out.println("Valeur de depart au dessus de l'intervalle puis incrementer");
        Jauge jauge = new Jauge(10,13);
        System.out.println(jauge.toString());
        jauge.incrementer();
        System.out.println(jauge.toString());
        boolean estRouge = jauge.estRouge();
        boolean estVert = jauge.estVert();
        System.out.println("Jauge est rouge : " + jauge.estRouge());
        System.out.println("Jauge est verte : " + jauge.estVert());

        if(estRouge && !estVert) {
            System.out.println("OK");
        } else {
            System.out.println("KO");
        }
    }

}
package tec;

public class DeboguePosition {

    public static void main(String[] args) {
        // Position pos = new Position();
        System.out.println("Test de la position dehors");
        DeboguePosition dpDehors = new DeboguePosition();
        dpDehors.verifPosDehors();
        System.out.println("\n");

        System.out.println("Test de la position assise");
        DeboguePosition dpAssis = new DeboguePosition();
        dpAssis.verifEstAssis();
        System.out.println("\n");

        System.out.println("Test de la position debout");
        DeboguePosition dpDebout = new DeboguePosition();  
        dpDebout.verifEstDebout();
        System.out.println("\n");

        System.out.println("Test de la position Intérieure Assis");
        DeboguePosition dpInterAssis = new DeboguePosition();  
        dpInterAssis.verifEstInterieurCasAssis();
        System.out.println("\n");

        System.out.println("Test de la position Intérieure Debout");
        DeboguePosition dpInterDebout = new DeboguePosition();  
        dpInterDebout.verifEstInterieurCasDebout();
        System.out.println("\n");

    }

    /**
     * Test des méthodes de la classe Position
     */

    public void verifEstAssis() {
        Position position = Position.creer();
        position = Position.assis();

        if (position.estAssis()) {
            System.out.println("La position est assise");
        } else {
            System.out.println("La position n'est pas assise");
        }
    }

    public void verifEstDebout() {
        Position position = Position.creer();
        position = Position.debout();

        if (position.estDebout()) {
            System.out.println("La position est debout");
        } else {
            System.out.println("La position n'est pas debout");
        }
    }

    public void verifPosDehors() {
        Position position = Position.creer();
        position = Position.creer();

        // cas assis
        if (position.estAssis()) {
            System.out.println("Assis : KO");
        } else {
            System.out.println("Assis : OK");
        }

        // cas debout
        if (position.estDebout()) {
            System.out.println("Debout : KO");
        } else {
            System.out.println("Debout : OK");
        }

        // cas dehors
        if (position.estDehors()) {
            System.out.println("Dehors : OK");
        } else {
            System.out.println("Dehors : KO");
        }

        // cas interieur
        if (position.estInterieur()) {
            System.out.println("Interieur : KO");
        } else {
            System.out.println("Interieur : OK");
        }
    }



    public void verifEstInterieurCasAssis() {
        Position position = Position.creer();
        position = Position.assis();

        if (position.estInterieur()) {
            System.out.println("La position est assise ou debout");
        } else {
            System.out.println("La position n'est pas assise ou debout");
        }
    }

    public void verifEstInterieurCasDebout() {
        Position position = Position.creer();
        position = Position.debout();

        if (position.estInterieur()) {
            System.out.println("La position est assise ou debout");
        } else {
            System.out.println("La position n'est pas assise ou debout");
        }
    }


}
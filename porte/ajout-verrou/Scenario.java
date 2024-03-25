public class Scenario {
    public static void main(String[] args) {
        // Création d'une porte avec un pas maximum de 3
        PorteVerrouCoulissante porte = new PorteVerrouCoulissante();
        
        // Affichage de l'état initial de la porte
        System.out.println("État initial de la porte :");
        porte.printPorteState();
        System.out.println("---------------------------");

        // Scénario 1 : Fermer la porte
        System.out.println("Scénario 1 : Fermer la porte");
        porte.fermer();
        porte.printPorteState();
        System.out.println("---------------------------");

        // Scénario 2 : Ouvrir la porte sans la déverrouiller (ne devrait pas fonctionner)
        System.out.println("Scénario 2 : Ouvrir la porte sans la déverrouiller");
        porte.ouvrir();
        porte.printPorteState();
        System.out.println("---------------------------");

        // Scénario 3 : Verrouiller la porte
        System.out.println("Scénario 3 : Verrouiller la porte");
        porte.verrouiller();
        porte.printPorteState();
        System.out.println("---------------------------");

        // Scénario 4 : Déverrouiller la porte
        System.out.println("Scénario 4 : Déverrouiller la porte");
        porte.deverrouiller();
        porte.printPorteState();
        System.out.println("---------------------------");

        // Scénario 5 : Ouvrir la porte après l'avoir déverrouillée
        System.out.println("Scénario 5 : Ouvrir la porte après l'avoir déverrouillée");
        porte.ouvrir();
        porte.printPorteState();
        System.out.println("---------------------------");

        // Scénario 6 : Coulisser la porte
        System.out.println("Scénario 6 : Coulisser la porte");
        porte.coulisser();
        porte.printPorteState();
        System.out.println("---------------------------");

        // Scénario 7 : Verrouiller la porte après l'avoir ouverte (ne devrait pas fonctionner)
        System.out.println("Scénario 7 : Verrouiller la porte après l'avoir ouverte (ne devrait pas fonctionner)");
        porte.verrouiller();
        porte.printPorteState();
    }
}
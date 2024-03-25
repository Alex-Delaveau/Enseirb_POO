public class Scenario {
    public static void main(String[] args) {
        PorteVerrouCoulissante porte = new PorteVerrouCoulissante();
        porte.printPorteState();
        porte.fermer();
        porte.printPorteState();
        porte.verrouiller();
        porte.printPorteState();
        porte.ouvrir();
        porte.printPorteState();
        porte.deverrouiller();
        porte.printPorteState();
        porte.ouvrir();
        porte.printPorteState();
        porte.coulisser();
        porte.printPorteState();
        porte.verrouiller();

        // Vérification de la possibilité de verrouiller après avoir coulissé
        porte.printPorteState();
        porte.verrouiller();
        porte.printPorteState();
    }
}

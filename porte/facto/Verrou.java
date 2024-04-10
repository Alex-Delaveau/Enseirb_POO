public class Verrou implements Porte{
    private Porte p;
    private boolean estDeVerrouille;

    public void verrouiller() {
        estDeVerrouille = false;
    }

}

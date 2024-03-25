public class PorteVerrouCoulissante {

    PorteCoulissante porteCoulissante;
    private boolean estDeVerrouille;

    PorteVerrouCoulissante() {
        porteCoulissante = new PorteCoulissante(3);
        estDeVerrouille = true;
    }

    public boolean estFerme() {
        return porteCoulissante.estFerme();
    }

    public void fermer() {
        porteCoulissante.fermer();
    }

    public void ouvrir() {
        if(estVerrouille())
            return;
        porteCoulissante.ouvrir();
    }

    public void coulisser() {
        if (estVerrouille())
            return;
        porteCoulissante.coulisser();
    }

    public void verrouiller() {
        estDeVerrouille = false;
    }

    public void deverrouiller() {
        estDeVerrouille = true;
    }

    public boolean estVerrouille() {
        return !estDeVerrouille;
    }


    public void printPorteState(){
        System.out.println("La porte est " + (estFerme() ? "fermée" : "ouverte") + " et " + (estVerrouille() ? "verrouillée" : "déverrouillée"));
    }
}

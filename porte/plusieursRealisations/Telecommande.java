
public class Telecommande {

  private final int maxPorte;
  private final java.util.ArrayList<Porte> mesPortes;

  public Telecommande(int maxPorte) {
    this.maxPorte = maxPorte;
    mesPortes = new java.util.ArrayList<Porte>(this.maxPorte);
  }

  public boolean estRempli() {
    return mesPortes.size() >= maxPorte;
  }

  public int nbPortes() {
    return mesPortes.size();
  }
  
  public void positionner(Porte p) {
    if (estRempli())
      return; /*Todo: erreur de depassement */

    mesPortes.add(p);
  }

  public void activer(int numero) {
    if (numero <= 0 || numero > mesPortes.size())
      return; /*Todo: erreur de numero */

    mesPortes.get(numero - 1).ouvrir();
  }

  public void desactiver(int numero) {
    if (numero <= 0 || numero > mesPortes.size())
      return; /*Todo: erreur de numero */

    mesPortes.get(numero - 1).fermer();
  }

  public void desactiverTout() {
    for (Porte p : mesPortes)
      if (p != null && !p.estFerme())
	p.fermer();
  }
}


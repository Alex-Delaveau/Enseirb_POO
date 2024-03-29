package autobus.heritage.tec;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class Autobus implements DemandeArret{

  private Jauge jaugeAssis;
  private Jauge jaugeDebout;
  private int numeroArret;
  private List<Passager> passagerStandards; 
  private List<Passager> passagerStandardsToDelete;


  // constructor
  public Autobus(int nbPlaceAssise, int nbPlaceDebout) {
    this.jaugeAssis = new Jauge(nbPlaceAssise, 0);
    this.jaugeDebout = new Jauge(nbPlaceDebout, 0);
    this.passagerStandards = new ArrayList<>(); 
    this.passagerStandardsToDelete = new ArrayList<>();
  }

  //methods
  @Override
  public boolean aPlaceAssise() {
    return jaugeAssis.estVert();
  }

  @Override
  public boolean aPlaceDebout() {
    return jaugeDebout.estVert();
  }

  protected void monteeDemanderAssis(Passager p) {
      jaugeAssis.incrementer();
      p.changerEnAssis();
      passagerStandards.add(p);
  }

  protected void monteeDemanderDebout(Passager p) {
      jaugeDebout.incrementer();
      p.changerEnDebout();
      passagerStandards.add(p);
  }

  public void allerArretSuivant() {
    this.numeroArret++;

    Iterator<Passager> it = passagerStandards.iterator();

    while (it.hasNext()) {
      it.next().nouvelArret(this, this.numeroArret);
    }


    for (Passager p : passagerStandardsToDelete) {
      passagerStandards.remove(p);
    }
  } 

  @Override
  public void arretDemanderAssis(Passager p) {
    if(!p.estDebout()){
      System.out.println("Le passager n'est pas debout");
      return;
    }
    if(!aPlaceAssise()){
      System.out.println("Il n'y a plus de place assise");
      return;
    }
    jaugeAssis.incrementer();
    jaugeDebout.decrementer();
    p.changerEnAssis();
  }

  @Override
  public void arretDemanderDebout(Passager p) {
    if(!p.estAssis()){
      System.out.println("Le passager n'est pas assis");
      return;
    }
    if(!aPlaceDebout()){
      System.out.println("Il n'y a plus de place debout");
      return;
    }
    jaugeAssis.decrementer();
    jaugeDebout.incrementer();
    p.changerEnDebout();
  }

  @Override
  public void arretDemanderSortie(Passager p) {
    if(p.estAssis()){
      jaugeAssis.decrementer();
    }else if(p.estDebout()){
      jaugeDebout.decrementer();
    }
    // passagerStandards.remove(p);
    passagerStandardsToDelete.add(p);
    p.changerEnDehors();
  }

  @Override
  public String toString() {
    return "[arret " + numeroArret + "] assis" + jaugeAssis.toString()
      + " debout" + jaugeDebout.toString();
  }
}




package autobus.heritage;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class Autobus {

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
  public boolean aPlaceAssise() {
    return jaugeAssis.estVert();
  }

  public boolean aPlaceDebout() {
    return jaugeDebout.estVert();
  }

  public void monteeDemanderAssis(PassagerStandard p) {
      jaugeAssis.incrementer();
      p.changerEnAssis();
      passagerStandards.add(p);
  }

  public void monteeDemanderDebout(PassagerStandard p) {
      jaugeDebout.incrementer();
      p.changerEnDebout();
      passagerStandards.add(p);
  }

  public void allerArretSuivant() {
    this.numeroArret++;

    Iterator<PassagerStandard> it = passagerStandards.iterator();

    while (it.hasNext()) {
      it.next().nouvelArret(this, this.numeroArret);
    }


    for (PassagerStandard p : passagerStandardsToDelete) {
      passagerStandards.remove(p);
    }
  } 

  public void arretDemanderAssis(PassagerStandard p) {
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

  public void arretDemanderDebout(PassagerStandard p) {
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

  public void arretDemanderSortie(PassagerStandard p) {
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




package autobus.heritage;


public interface Passager {

  //methods
  public String nom();
 
  public boolean estDehors();
 
  public boolean estAssis();
 
  public boolean estDebout();
 
  public void changerEnDehors();
 
  public void changerEnAssis();
 
  public void changerEnDebout();
 
  public void monterDans(Autobus t);
 
}

package porte.heritage;


class PorteCoulissante implements Porte{
    private final int MAX;
    private int pas;
  
    public PorteCoulissante(int pasMax) {
      MAX = pasMax;
      pas = 0;
    }

    @Override
    public boolean estFerme() {
        return MAX == pas;
    }

    @Override
    public void fermer() {
        for (; pas < MAX; pas++) ;
    }

    @Override
    public void ouvrir() {
        for (; pas > 0; pas--) ;
    }

    public void coulisser() {
        if (estFerme())
          ouvrir();
        else
          fermer();
      }
  
  }
  
  
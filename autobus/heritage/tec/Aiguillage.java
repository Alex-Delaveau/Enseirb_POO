package autobus.heritage.tec;

interface IAction {
    void executer();
}



class Aiguillage {
    private int nbAiguillage;

    Aiguillage(int max) {
        nbAiguillage = max - 1;
    }

    void executer(IAction action) {
        if (estHorsLimite()) {
            System.out.println("limite depassee");
            return;
        }

        action.executer();
        nbAiguillage--;
    }

    boolean estHorsLimite() {
        return nbAiguillage < 0;
    }
}

class A implements IAction {
    public void jeter() {
        System.out.print("<Hop Hop>");
    }

    public void rattrapper() {
        System.out.println("<Poh Poh>");
    }

    @Override
    public void executer() {
        jeter();
        rattrapper();
    }

}

class B implements IAction {
    public void lancer() {
        System.out.println("shazammm");
    }

    @Override
    public void executer() {
        lancer();
    }
}

class RetI implements IAction {
    public void caster() {
        System.out.println("Conversion de type");
    }

    @Override
    public void executer() {
        caster();
    }
}

class TestAiguillage {
    static public void main(String[] args) {
        Aiguillage g = new Aiguillage(5);

        g.executer(new B());
        g.executer(new A());
        g.executer(new B());
        g.executer(new A());
        g.executer(new RetI());
    }
}

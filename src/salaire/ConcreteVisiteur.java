package salaire;

public class ConcreteVisiteur implements IVisiteur{

    public ConcreteVisiteur() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public void visitDirecteur(Directeur direct) {
        // TODO Auto-generated method stub
        direct.salaire();
    }

    @Override
    public void visitManager(Manager man) {
        // TODO Auto-generated method stub
        man.salaire();
    }

    @Override
    public void visitCommercial(Commercial com) {
        // TODO Auto-generated method stub
        com.salaire();
    }

    @Override
    public void visitOuvriere(Ouvriere ouv) {
        // TODO Auto-generated method stub
        ouv.salaire();
    }

}

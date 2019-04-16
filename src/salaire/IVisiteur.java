package salaire;

public interface IVisiteur {

    public void visitDirecteur(Directeur direct);
    public void visitManager(Manager man);
    public void visitCommercial(Commercial com);
    public void visitOuvriere(Ouvriere ouv);
}

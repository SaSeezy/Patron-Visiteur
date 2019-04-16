package salaire;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        IVisiteur visiteur = new ConcreteVisiteur();
        
        IEmploye direct = new Directeur();
        IEmploye manag = new Manager();
        IEmploye commer = new Commercial();
        IEmploye ouvr = new Ouvriere();

        direct.accept(visiteur);
        manag.accept(visiteur);
        commer.accept(visiteur);
        ouvr.accept(visiteur);
    }


}

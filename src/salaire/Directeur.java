package salaire;

public class Directeur implements IEmploye{

    private int indice=100;
    private int salaireBase=200000;
    private int bonus=50000;
    
    public Directeur() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public void accept(IVisiteur v) {
        // TODO Auto-generated method stub
        v.visitDirecteur(this);
    }

    public void salaire() {
         System.out.println("Salaire du Directeur: "+ (indice * salaireBase + bonus));
    }
}

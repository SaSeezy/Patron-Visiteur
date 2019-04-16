package salaire;

public class Ouvriere implements IEmploye{

    private int nbreHeure=50;
    private int salaireHoraire=5000;
    
    public Ouvriere() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public void accept(IVisiteur v) {
        // TODO Auto-generated method stub
        v.visitOuvriere(this);
    }
    
    public void salaire() {
         System.out.println("Salaire de l'Ouvrière: "+ (salaireHoraire * nbreHeure + 5000));
    }

}

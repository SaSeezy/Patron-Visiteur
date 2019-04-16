package salaire;

public class Commercial implements IEmploye{

    private int primeVente=200000;
    
    public Commercial() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public void accept(IVisiteur v) {
        // TODO Auto-generated method stub
        v.visitCommercial(this);
    }
    
    public void salaire() {
        System.out.println( "Salaire du Commercial: "+ (primeVente + 10000));
    }

}

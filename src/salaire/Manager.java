package salaire;

public class Manager implements IEmploye{

    private  int indice=100;
    private int salaireBase=100000;
    private  int prime=30000;
    private int impot=50000;
    
    public Manager() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public void accept(IVisiteur v) {
        // TODO Auto-generated method stub
        v.visitManager(this);
    }

    public void salaire() {
         System.out.println("Salaire du Manager: " +(indice * salaireBase + prime - impot));
    }
}

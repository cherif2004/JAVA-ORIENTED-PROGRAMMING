package JAVA_ORIENTED_PROGRAMMING.EXERCICE_7;

public class Compte {
    protected String numero ;
    protected String proprietaire ;
    protected int solde ;

    public Compte(String numero , String proprietaire , int solde){
        this.numero = numero ;
        this.proprietaire = proprietaire ;
        this.solde = solde ;
    

    }

   public void Deposer (int montant){
      
    solde += montant ;

}

public void Retirer(int montant){
    solde -=montant ;

    

}



}

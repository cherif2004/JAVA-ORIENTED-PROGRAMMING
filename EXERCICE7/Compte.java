package JAVA_ORIENTED_PROGRAMMING.EXERCICE7;

public class Compte {
    private String numero ;
    private String proprietaire ;
    private int solde ;

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

public String getNumero(){
    return numero ;

}

public String getProprietaire(){
    return proprietaire ;

}

public int getsolde(){
    return solde ;
}


}

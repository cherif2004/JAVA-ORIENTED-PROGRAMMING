// La classe CompteSecurise hérite de la classe Compte et remplace la méthode retirer avec une vérification supplémentaire pour s'assurer que le solde est suffisant avant de procéder au retrait.

package myPackages;

public class CompteSecurise extends Compte {

    public CompteSecurise(String numero, String proprietaire, double solde) {
        super(numero, proprietaire, solde);
    }

    @Override
    public void Retirer(double montant){
        if (montant <= this.solde)
            super.Retirer(montant);   
        else 
            System.out.println("Solde insuffisant pour effectuer le retrait.");           
    }

}

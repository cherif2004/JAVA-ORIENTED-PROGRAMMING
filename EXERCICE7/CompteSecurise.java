// La classe CompteSecurise hérite de la classe Compte et remplace la méthode retirer avec une vérification supplémentaire pour s'assurer que le solde est suffisant avant de procéder au retrait.

package JAVA_ORIENTED_PROGRAMMING.EXERCICE7;

public class CompteSecurise extends Compte {

    public CompteSecurise(String numero, String proprietaire, int solde) {
        super(numero, proprietaire, solde);
    }

    @Override
    public void Retirer(int montant){
        if (montant <= getsolde()) {
            super.Retirer(montant);
            
        } else if (montant > getsolde()) {
             System.out.println("Solde insuffisant pour effectuer le retrait.");
        } 
           
        
    }
    
    public static void main(String[] args){

        Compte compte = new Compte("657097369", "MFENJOU ANAS CHERIF", 50000);

        compte.Deposer(2000);
        compte.Retirer(500);

        System.out.println("Solde du compte : " + compte.getsolde());

        CompteEpargne compteEpargne = new CompteEpargne("696934667", "AMADOU", 100000, 0.05);

        compteEpargne.appliquerInteret();

        System.out.println("Solde du compte épargne : " + compteEpargne.getsolde());

        CompteSecurise compteSecurise = new CompteSecurise("693803447", "LADIFATOU", 200000);

        compteSecurise.Retirer(200000);
        compteEpargne.Retirer(3000);

    }


}

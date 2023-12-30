import myPackages.*;

public class test {
    public static void main(String[] args){

        Compte cmpt[] = new Compte[3];
        
        /*      Premier Compte (Compte simple) */
        cmpt[0] = new Compte("657097369", "MFENJOU ANAS CHERIF", 50000);

        /*      Deuxieme Compte (Compte Epargne) */
        cmpt[1] = new CompteEpargne("696934667", "AMADOU", 100, 5);

        /*      Troisieme Compte (Compte Securisé) */
        cmpt[2] = new CompteSecurise("693803447", "LADIFATOU", 200000);
        

        for (Compte compte : cmpt)
        {

            System.out.println("---------------------------------");
            compte.printInfos(); // Affichage du solde
            compte.Retirer(2050); // Retrait de 2050f
            compte.printInfos(); // Affichage du nouveau solde
            compte.Deposer(8000f); // Depot de 8000f
            compte.printInfos(); // Affichage 
            compte.Retirer(5000000); // retrait d'un gros montant (depassant mon solde)
            compte.printInfos(); // Affichage 
        }
    }
}

package myPackages;

public class Compte {

    protected String numero ;
    protected String proprietaire ;
    protected double solde ;

    public Compte(String numero , String proprietaire , double solde){
        this.numero = numero ;
        this.proprietaire = proprietaire ;
        this.solde = solde ;
    }

    public void Deposer (double montant){   
        this.solde += montant ;
    }

    public void Retirer(double montant){
        this.solde -= montant ;
    }

    /*  Ajout volontaire d'un methode me permettant de consulter mon solde */
    public void printInfos()
    {

        System.out.println("Proprietaire : "+this.proprietaire.toUpperCase());
        System.out.println("Solde : "+this.solde+" FCFA\n");
    }

}

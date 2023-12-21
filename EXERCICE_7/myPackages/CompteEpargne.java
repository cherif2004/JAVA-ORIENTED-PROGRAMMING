// La classe CompteEpargne hérite de la classe Compte et ajoute un nouvel attribut tauxInteret (type double). Elle possède un constructeur pour initialiser tous les attributs, ainsi qu'une méthode appliquerInteret qui calcule l'intérêt en fonction du solde actuel et du taux d'intérêt, puis dépose le montant de l'intérêt sur le compte

package myPackages;

public class CompteEpargne extends Compte {

    private double tauxInteret ;

    public CompteEpargne(String numero, String proprietaire, double solde , double tauxInteret) {
        super(numero, proprietaire, solde);
        this.tauxInteret = tauxInteret ;
    }

    public void appliquerInteret(){
        double interet = (solde * tauxInteret ) / 100;
        Deposer(interet) ;
    }
    
}

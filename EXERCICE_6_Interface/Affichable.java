package JAVA_ORIENTED_PROGRAMMING.EXERCICE_6_Interface;

public  interface Affichable {
     void affiche();
}

class Entier implements Affichable {
    private int valeur;

    public Entier(int valeur) {
        this.valeur = valeur;
    }

    @Override
    public void affiche() {
        System.out.println("Je suis un entier de valeur " + valeur);
    }
}

class Flottant implements Affichable {
    private float valeur;

    public Flottant(float valeur) {
        this.valeur = valeur;
    }

    @Override
    public void affiche() {
        System.out.println("Je suis un flottant de valeur " + valeur);
    }



 public static void main(String[] args) {
        Affichable entier = new Entier(42);
        entier.affiche(); // Affiche "Je suis un entier de valeur 42"

        Affichable flottant = new Flottant(3.14f);
        flottant.affiche(); // Affiche "Je suis un flottant de valeur 3.14"
    }

}
package JAVA_ORIENTED_PROGRAMMING.EXERCICE_2_HERITAGE;

 import JAVA_ORIENTED_PROGRAMMING.EXERCICE_1_Classe_simple_et_objet_en_Java.Point ;

// Question 1
 public class Pointcol extends Point {

 private byte couleur ;

 public Pointcol(byte couleur){
    super();
    this.couleur = couleur ;


 }

 public Pointcol(){
    super();

 }

 public void colorer(byte couleur){
    
    this.couleur = couleur ;

 } 

 public void afficheCol(){
    System.out.println("je suis un point coloré de coordonnées(" + x + "," + y + " ) et de couleur " + couleur) ;

 }
  
 public static  void main(String[] args){
    Pointcol pointcol = new Pointcol() ;
    pointcol.initialiser(5, 9);  // Initialise les coordonnées x et y à 5 et 9
    pointcol.colorer((byte) 0);  // Couleur
    pointcol.afficheCol(); // Affiche les coordonnées et la couleur du point
 }

}

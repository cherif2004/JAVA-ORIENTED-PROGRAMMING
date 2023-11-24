package JAVA_ORIENTED_PROGRAMMING.EXERCICE_4_Polymorphisme;

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

 public static void  identifier(Object object){

      if (object instanceof Pointcol) {
      Pointcol pointcol = (Pointcol) object ;

      System.out.println("je suis un point coloré de couleur " + pointcol.couleur);
      }
       
     else if (object instanceof Point) {
      Point point = (Point) object ;
      point.afficher();
      
   }else
      System.out.println("");
   

 }
  
 public static  void main(String[] args){
   Point point = new Point();
   point.initialiser(2, 3);

    Pointcol pointcol = new Pointcol() ;
    pointcol.initialiser(4, 9);  // Initialise les coordonnées x et y à 5 et 9
    pointcol.colorer((byte) 0);  // Couleur
    
    identifier(point);// Affiche "Je suis un point de coordonnées (2, 3)"

    identifier(pointcol);  // Affiche "Je suis un point coloré de couleur 0"
 }

}

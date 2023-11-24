package JAVA_ORIENTED_PROGRAMMING.EXERCICE_1_Classe_simple_et_objet_en_Java ;

public class Point {
    private int x ;
    private int y ;

    public Point (int x , int y){
        this.x  = x ;
        this.y  = y ;
    }

    public Point(){

    }
    
    // pour attribuer des valeurs aux coordonnées d’un point;
    public void initialiser(int x , int y){
        this.x = x ;
        this.y = y ;
    }

    // pour modifier les coordonnées d’un point;
    public void deplacer (int deltaX , int deltaY){
        x += deltaX ;
        y += deltaY ;

    }


    // 
    public void afficher(){
        System.out.println("je suis un point de coordonnées " + x + "et" +y);
    }

}

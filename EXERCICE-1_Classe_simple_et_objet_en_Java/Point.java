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


    // pour  afficher  un  point  ; 
    public void afficher(){
        System.out.println("je suis un point de coordonnées " + x + "et" +y);
    }

}

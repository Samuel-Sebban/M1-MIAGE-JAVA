package fr.dauphine.javaavance.td1;


public class Polyline {
	    private Point[] points;
	    private int nbMax;
	    private int nbPoints;
	    
	    public Polyline(int capacity){
	        this.nbMax = capacity;
	        this.nbPoints = 0;
	        this.points = new Point[ this.nbMax ];
	    }
	    public void add(Point p){
	        if( p!=null && nbPoints < nbMax){
	            this.points[nbPoints]=p;
	            this.nbPoints++;
	        }else
	            System.out.println( " Pas assez de place pour ajouter un nouveau point"+p);
	    }
	    public void pointCapacity(){
	        System.out.println( "Capacité de la ligne brisée : "+ this.nbMax);
	    }
	    public void nbPoints(){
	        System.out.println( "Nombre de points actuellement sur la ligne : "+ this.nbPoints);
	    }
	    public boolean contains( Point p){
	        if( p==null || this.nbPoints==0 ) return false;
	        for( Point l_point : this.points ) {
	            //System.out.println( p);
	            if(l_point!=null) {
	                System.out.println("lp :" + l_point);
	                if (l_point.isSameAs(p))
	                    return true;
	            }
	        }
	        return false;
	        
	    }
	    
	  
	}


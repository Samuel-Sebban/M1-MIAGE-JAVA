package fr.dauphine.javaavance.td1;

import java.util.Iterator;
import java.util.LinkedList;

public class Circle {
	 private Point centre;
	 private int rayon;
	 
	 public Circle ( Point p, int r){
	        this.centre = p;
	        this.rayon = r;
	    }
	 @Override
	public String toString(){
		return "rayon cercle: " + this.rayon + " centre: " + this.centre+"surface:"+this.surface();
	}
	
	 public void translate(int dx,int dy){
	        this.centre=this.centre.translate(dx,dy);
	    }

	
	 //public Point getCenter(){
	        //return this.centre;
	    //}
	 public Point getCentre() {
			return new Point(centre);
		}
	 public double surface(){
	        return Math.PI * this.rayon * this.rayon;
	    }
	 public boolean contains(Point p){
	        if(p==null) return false;
	        if( p.isSameAs(this.centre)) return true;
	        int dist_p_centre =(int) Math.sqrt( ((p.getX()-this.centre.getX())*(p.getX()-this.centre.getX()))+
	                ((p.getY()-this.centre.getY())*(p.getY()-this.centre.getY())));
	        return dist_p_centre <= this.rayon;
	    }
	 
		public static void main(String[] args) {
			Circle c=new Circle(new Point(2,1),3);
			c.getCentre().translate(2,2);
			System.out.println(c);
			System.out.println(c.contains(new Point(5,0)));

		}
	 
	 
	
	 
	 
	 
	
	 
	 
	 
}

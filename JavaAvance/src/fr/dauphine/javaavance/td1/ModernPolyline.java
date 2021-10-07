package fr.dauphine.javaavance.td1;
import java.util.LinkedList;

public class ModernPolyline {
	private LinkedList<Point> points;
    public ModernPolyline(){
        this.points = new LinkedList<Point>();
    }
    public void add(Point p){
        if( p!=null )
            this.points.add(p);
    }
    public int nbPoints(){
        return this.points.size();
    }
    public boolean contains( Point p){
        if( p==null || this.points.size()==0 ) return false;
        return this.points.contains(p);
    }

	

}



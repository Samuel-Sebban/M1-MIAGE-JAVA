package fr.dauphine.javaavance.td1;

import java.util.ArrayList;

public class Point {
	private int x;
	private  int y;
	
	
	
	public Point (int px,int py){
		this.x=px;
		this.y=py;
}
	public Point( Point p){
        this.x = p.x;
        this.y = p.y;
	}	
	public boolean isSameAs(Point p) {
		return p.x==this.x && p.y==this.y;
		
	}
	@Override
	public boolean equals(Object ob) {
		Point p = (Point) ob;
		return p.x == this.x && p.y==this.y;
	}
	
	public int getY() {
		return y;
	}
	public int getX() {
		return x;
	}
	public String toString() {
		return("("+ this.x + "," + this.y+ ")");
	}	
	//ex5(translate)
	public void translate(int dx, int dy) {
		this.x = dx;
		this.y= dy;
	}
	

	public static void main(String[] args) {
		Point p1=new Point(1,2); 
		Point p2=p1;
		Point p3=new Point(1,2);
		
		ArrayList<Point> list = new ArrayList<>(); 
		list.add(p1);
		System.out.println(list);
		System.out.println(list.indexOf(p2)); 
		System.out.println(list.indexOf(p3));
		
		
		}
	
}










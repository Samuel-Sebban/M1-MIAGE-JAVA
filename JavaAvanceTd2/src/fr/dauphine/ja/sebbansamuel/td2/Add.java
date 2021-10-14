package fr.dauphine.ja.sebbansamuel.td2;

public class Add implements Expr {
	Expr right;
	Expr left;
	public Add(Expr a,Expr b){
		this.right=a;
		this.left=b;
}
	public double eval() {
		return (this.right.eval()+this.left.eval());
	}
	public String toString() {
		return(left.toString()+right.toString());
}



}
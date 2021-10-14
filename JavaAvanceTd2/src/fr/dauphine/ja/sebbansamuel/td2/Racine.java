package fr.dauphine.ja.sebbansamuel.td2;

import java.lang.Math;


public class Racine implements Expr{
	Expr val;
	public Racine (Expr v) {
		this.val=v;

}
	@Override
	public double eval() {
		
		System.out.println("la racine carré \u221a ");
		double nou = Math.sqrt(this.val.eval());
		return nou;
	
	}
	
	
}


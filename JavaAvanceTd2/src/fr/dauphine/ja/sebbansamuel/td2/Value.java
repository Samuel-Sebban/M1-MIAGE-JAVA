package fr.dauphine.ja.sebbansamuel.td2;

class Value implements Expr {
	final private double val;
		public Value(double v) {
			val=v;
		}
	public double eval() {
		return val;
	}

}
package fr.dauphine.javaavance.td4.ex1;

public class Cell {
	private String s;
	private Cell refs;
	
	public Cell (String s) {
		this.s = s;
		this.refs=null;
	}
	public void setS(String s)
	{
		this.s=s;
	}
	public String getS() {
		return s;
	}

	public void setRef(Cell refs){
		this.refs=refs;
	}

	public Cell getRef(){
		return this.refs;
	}
}

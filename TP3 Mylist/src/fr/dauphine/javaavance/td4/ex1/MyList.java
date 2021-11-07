package fr.dauphine.javaavance.td4.ex1;

public class MyList {
	private int taille;
	private Cell prem;
	
	public MyList(int taille, Cell prem)
	{
		this.prem=prem;
		this.taille=taille;
	}
	public MyList() {
	}
	
	public void add(String s)
	{
		
		Cell premnew = new Cell(s);
		Cell premold=null;
		premold=prem;
		taille++;
	
		if (prem!=null)
			premnew.setRef(premold);
		
		prem=premnew;
	}
	
		
		
	public int size()
	{
		return taille;
	}
	public String toString(){
		Cell c = prem;
	    StringBuilder sb = new StringBuilder();
	    while (c != null) {
	    	sb.append(c.getS() + ", ");
	        c = c.getRef();
	        }
	        return sb.toString();
	}
	public void addLast(String s)
	{
		Cell nouveau = new Cell(s);
		Cell dernier =null;
		if (prem == null) {
            prem= nouveau;
            return;
        }
		dernier= prem; 
		while (dernier != null) {
            if (dernier.getRef() == null)
                break;
            dernier = dernier.getRef();

        }
		dernier.setRef(nouveau);
		taille++;
		
	}
	public void add(String s, int i) {
        if (i > size())
            throw new IndexOutOfBoundsException();

        Cell c = prem;

        for (int k = 0; k < size() && c != null; ++k) {
            if (k == i) {
                c.setRef(new Cell(s));
            }
            c = c.getRef();
        }
        taille++;
    }
	
	public String get(int i) {
        if (i > size())
            throw new IndexOutOfBoundsException();
        Cell c = prem;

        for (int k = 0; k < size(); ++k) {
            c = c.getRef();
            if (i == k)
                return c.getS();
        }

        return "";
    }

	public int summLetters() {
		int somme=0;
		Cell c= prem;
		  while (c != null) {
	            somme += c.getS().length();
	            c = c.getRef();
	        }
		return somme;
	}
	public static void main(String[] args) {
		MyList m1 = new MyList();
		m1.addLast("tatu");
		m1.add("toto");
		m1.add("titi");
		m1.addLast("tutu");
	}


}

	
	

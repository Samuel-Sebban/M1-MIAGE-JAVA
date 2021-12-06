package Td4dauphinesebban;
import java.util.ArrayList;
import java.util.Objects;

public class Garage {
	
	private ArrayList<Vehicule> LesVehicules = new ArrayList<Vehicule>();
	
	public void addCar(Vehicule v) {
		this.LesVehicules.add(Objects.requireNonNull(v));
	}
	
	public int sizeG() {
		return LesVehicules.size();
	}
	
	public ArrayList<Vehicule> getTheVehicules(){
		return this.LesVehicules;
	}
	
	public String toString() {
		StringBuilder res = new StringBuilder();
		for (Vehicule v : LesVehicules) {
			res.append(v.toString());
		}
		return res.toString();
	}
	
	public int valeur() {
		int cumul = 0;
		for (Vehicule v : LesVehicules) {
			cumul += v.getValue();
		}
		return cumul;
	}
	
	public Vehicule firstCarByBrand(String brand) {
		boolean inside = false;
		Vehicule v = null;
		for (int i = 0; i < LesVehicules.size() && inside == false; i++) {
			v = LesVehicules.get(i);
			if (v.getBrand().equals(brand)) inside= true;
			else v = null;
		}
		return v;
	}
	
	public void remove(Car c) {
		this.LesVehicules.remove(c);
	}
	
	public void protectionism(String brand) {
		for (Vehicule v : LesVehicules) {
			if(v.getBrand().equals(brand)) {
				if(LesVehicules.remove(v))System.out.println("Bien supprimé");
				}
		}
	}
	
	@Override
	public boolean equals(Object o) {
		if(!( o instanceof Garage)){
			return false;
		}
		Garage g = (Garage) o;
		boolean sameVehicule = true;
		if(!(this.getTheVehicules().equals(g.getTheVehicules()))) sameVehicule= false;
		return sameVehicule;
	}
	
}

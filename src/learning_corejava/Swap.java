package learning_corejava;

import sushree.deloitte.Marker;

public class Swap {

	public static void main(String[] args) {
		Marker a= new Marker("Black","Reynolds", 25);
		Marker b= new Marker("Blue","Camlin", 20);
		System.out.println(a.getPrice() + " " + b.getPrice());
		swap(a,b);
		System.out.println(a.getPrice() + " " + b.getPrice());
		System.gc();

	}
	public static void swap(Marker m1, Marker m2) {
		double temp=m1.getPrice();
		m1.setPrice(m2.getPrice());
		m2.setPrice(temp);
	}
	

}

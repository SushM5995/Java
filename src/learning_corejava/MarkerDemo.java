package learning_corejava;

import sushree.deloitte.Marker;
import java.util.Date;

public class MarkerDemo {
	
	public static void main(String[] args) {
		Marker a= new Marker("Black","Reynolds", 25);
		
		System.out.println(a.getPrice());
		a.setPrice(35);
		System.out.println(a.getPrice());
		
		System.out.println(a.category);
		a.setCategory("Marker Pens");
		System.out.println(a.category);
		
	}
	public static void main3(String[] args) {
		Marker a= new Marker("Black","Reynolds", 25);
		Marker b= new Marker("Blue","Camlin", 20);
		Date d=new Date();
		
		System.out.println(a.color);
		System.out.println(b.color);
		
		System.out.println(d);
		System.out.println(a.toString());
		System.out.println(b.toString());
		
		
	}
	public static void main2(String[] args) {
		Marker a= new Marker("Black","Reynolds", 25);
		Marker b= new Marker("Blue","Camlin", 20);
		
		System.out.println(a.color);
		System.out.println(b.color);
		
		System.out.println(a.category);
		System.out.println(b.category);
		
		a.color="Red";
		b.color="Green";
		
		a.category="Stationary";
		b.category="Writing Instruments";

		System.out.println(a.color);
		System.out.println(b.color);
		
		System.out.println(a.category);
		System.out.println(b.category);
		
		
	}

	public static void main1(String[] args) {
		Marker a= new Marker("Black","Reynolds", 25);
		Marker b= new Marker("Blue","Camlin", 20);
		System.out.println(a.color + " " + a.brand);
		System.out.println(b.color + " " + b.brand);
		

	}
	
}

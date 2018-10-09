package sushree.deloitte;

public class Marker {

		private double price;
		public final String brand;
		public String color;
		
		public Marker(String c,String b,double p)
		{
			brand=b;
			color=c;
			price=p;
		}
		public void setCategory(String category) {
			this.category=category;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			if(price>0)
				this.price=price;
			else
				System.out.println("Invalid Price !!");
		}
		public static String category="Pens";

}

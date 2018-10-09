package learning_corejava;

public class Inheritance {
	
	public static void main(String[] args) {
		Bird b1=new Bird();
		b1.move(500);
		//b1.move(500L);
		
	}
	public static void main2(String[] args) {
		Bird b1=new Bird();
		Animal a1=new Bird();
		
		b1.eat();
		a1.eat();
		b1.fly(100);
		//a1.fly(100); Not possible
		
		Bird b2=(Bird) a1; //TypeCasting
		Animal a2= b1;
		//Animal a3=new Animal();
		//Bird b3=(Bird)a3; //ClassCastException at runtime
	}

	public static void main1(String[] args) {
		Bird b=new Bird();
		b.eat();
		b.fly(120);
		
		/*Animal a=new Animal();
		a.eat();
		a.move(40);
		*/
	}

}

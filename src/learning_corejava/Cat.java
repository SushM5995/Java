package learning_corejava;

public class Cat extends Animal implements Hunter,Jumper,Runner {
	
	public void hunt()
	{
		System.out.println("Cat is hunting");
	}
	public void jump()
	{
		System.out.println("Cat is jumping");
	}
	public void run()
	{
		System.out.println("Cat is running");
	}
	public void move(int d)
	{
		System.out.println("Cat moved "+d+" distance");
	}

	public static void main(String[] args) {
		Cat c=new Cat();
		c.hunt();
		c.jump();
		c.run();
		c.move(50);
		

	}

}

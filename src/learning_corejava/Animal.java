package learning_corejava;

public abstract class Animal extends Object {
	
	boolean alive;
	{
		alive=true;
	}
	public Animal()
	{
		//alive=true;
	}
	public void eat()
	{
		System.out.println("Animal is eating");
		
	}
	public abstract void move(int dist);
	
	/*public void move(int dist)
	{
		System.out.println("Animal can move "+ dist +" distance");
	}*/


}

package book.entity;

public class BookDemo {

	public static void main(String[] args) {
		Book b1=new Book(300,"Intro to Java","Gosling","Pearson",0);
		Book b2=new Book(460,"Intro to Python","James","Pearson",34);
		
		if(b1.isClose(b1.currPage))
		{
			b1.currPage=b1.open();
			System.out.println("Book "+b1.title+" is now open at page "+b1.currPage);
		}
		else
			System.out.println("Book "+b1.title+" is open at page "+b1.currPage);
		
		
		if(b2.isClose(b2.currPage))
		{
			b2.currPage=b2.open();
			System.out.println("Book "+b2.title+" is now open at page "+b2.currPage);
		}
		else
			System.out.println("Book "+b2.title+" is open at page "+b2.currPage);

	}

}

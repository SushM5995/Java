package book.entity;

public class Book {
	
	int pages;
	String title, author, publisher;
	int currPage;
	
	public Book(int p, String t, String a, String pub, int c)
	{
		pages=p;
		title=t;
		author=a;
		publisher=pub;
		currPage=c;
	}
	
	public boolean isOpen(int c)
	{
		if(c!=0)
			return true;
		else
			return false;
	}
	public boolean isClose(int c)
	{
		if(c==0)
			return true;
		else
			return false;
	}
	public int open()
	{
		currPage=1;
		return currPage;
	}
	public int open(int c)
	{
		currPage=c;
		return currPage;
	}
	public void close()
	{
		currPage=0;
	}
	public void turnLeft()
	{
		
	}
	public void turnRight()
	{
		
	}


}

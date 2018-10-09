package sushree.deloitte.api;

public class StringDemo {

	public static void main(String[] args) {
		
		
	}
	public static void main1(String[] args) {
		String s1= "Java Programming Language";
		System.out.println(s1.length());
		System.out.println(s1);
		System.out.println(s1.charAt(14));
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.hashCode());
		s1=s1 + " created by James";
		System.out.println(s1);
		System.out.println(s1.hashCode());
		System.out.println(s1.substring(10));
		System.out.println(s1.substring(10,12));

	}

}

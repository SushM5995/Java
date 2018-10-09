package sushree.deloitte;

public class ArrayD {
	public static void main(String[] args) {
		int[][] a = {{12,15},{16,20,36,84},{32,21,22},{16}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
		
	}

	public static void main1(String[] args) {
		int[][] a;
		a=new int[4][];
		a[0]=new int[2];
		a[1]=new int[4];
		a[2]=new int[3];
		a[3]=new int[1];
		a[0][0]=12;
		a[0][1]=15;
		a[1][0]=16;
		a[1][1]=20;
		a[1][2]=36;
		a[1][3]=84;
		a[2][0]=32;
		a[2][1]=21;
		a[2][2]=22;
		a[3][0]=16;
		for(int i=0;i<4;i++)
		{
			if(i==0)
				System.out.println(a[i][0]+" "+a[i][1]);
			else if(i==1)
				System.out.println(a[i][0]+" "+a[i][1]+" "+a[i][2]+" "+a[i][3]);
			else if(i==2)
				System.out.println(a[i][0]+" "+a[i][1]+" "+a[i][2]);
			else if(i==3)
				System.out.println(a[i][0]);
		}
		

	}

}

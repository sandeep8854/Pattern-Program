import java.util.Scanner;

public class Pattern_17
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ? ?");
		int number=sc.nextInt();
		for(int i=1;i<=number;i++)
		{
			for(int j=number;j>=i;j--)
			{
				System.out.print(" "+i);
			}
			System.out.println();	
		}
	}
}
/*
Enter Any Number ? ?
5
 1 1 1 1 1
 2 2 2 2
 3 3 3
 4 4
 5
*/
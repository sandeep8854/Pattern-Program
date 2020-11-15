import java.util.Scanner;

public class Pattern_18 
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
				System.out.print(" "+j);
			}
			System.out.println();
		}
	}
}
/*
Enter Any Number ? ?
5
 5 4 3 2 1
 5 4 3 2
 5 4 3
 5 4
 5
 */

import java.util.Scanner;

public class Pattern_16
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ? ?");
		int number=sc.nextInt();
		for(int i=0;i<number;i++)
		{
			for(int j=number;j>i;j--)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
/*
Enter Any Number ? ?
5
 * * * * *
 * * * *
 * * *
 * *
 *
*/

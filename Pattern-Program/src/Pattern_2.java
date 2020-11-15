import java.util.Scanner;

public class Pattern_2 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ? ?");
		int number=sc.nextInt();
		for(int i=0;i<number;i++)
		{
			for(int j=0;j<number;j++)
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
 0 0 0 0 0
 1 1 1 1 1
 2 2 2 2 2
 3 3 3 3 3
 4 4 4 4 4
 
*/

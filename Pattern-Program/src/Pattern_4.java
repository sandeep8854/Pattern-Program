import java.util.Scanner;

public class Pattern_4
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ? ?");
		int number=sc.nextInt();
		for(int i=1;i<=number;i++)
		{
			for(int j=1;j<=number;j++)
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
 1 2 3 4 5
 1 2 3 4 5
 1 2 3 4 5
 1 2 3 4 5
 1 2 3 4 5
*/

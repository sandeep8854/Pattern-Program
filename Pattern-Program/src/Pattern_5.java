import java.util.Scanner;

public class Pattern_5
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ? ?");
		int number=sc.nextInt();
		for(int i=number;i>=1;i--)
		{
			for(int j=1;j<=number;j++)
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
 5 5 5 5 5
 4 4 4 4 4
 3 3 3 3 3
 2 2 2 2 2
 1 1 1 1 1
*/
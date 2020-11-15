import java.util.Scanner;

public class Pattern_22 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ? ?");
		int number=sc.nextInt();
		for(int i=number-1;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" "+(char)(i+65));
			}
			System.out.println();
		}
	/*	for(int i=4;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" "+(char)(i+65));
			}
			System.out.println();
		}*/
		
	}
}
/*
Enter Any Number ? ?
5
 E E E E E
 D D D D
 C C C
 B B
 A
*/
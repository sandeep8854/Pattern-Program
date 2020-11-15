import java.util.Scanner;

public class Pattern_29
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number");
		int number=sc.nextInt();
		for(int i=0;i<number;i++)
		{
			for(int j=number-1;j>i;j--)
			{
				System.out.print("  ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print(" "+(char)(k+65));
			}
			System.out.println();
		}	
	}
}
/*
Enter Any Number
5
         A
       A B
     A B C
   A B C D
 A B C D E
*/
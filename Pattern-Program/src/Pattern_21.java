import java.util.Scanner;

public class Pattern_21
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ? ?");
		int number=sc.nextInt();
		for(int i=number;i>=0;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" "+(char)(j+65));
			}
			System.out.println();
		}
	}
}
/*
Enter Any Number ? ?
5
 A B C D E
 A B C D
 A B C
 A B
 A
*/
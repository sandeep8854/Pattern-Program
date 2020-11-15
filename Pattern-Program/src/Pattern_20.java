import java.util.Scanner;

public class Pattern_20 
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
				System.out.print(" "+(char)(i+65));
			}
			System.out.print("\n");
		}	
	}
}

/*
Enter Any Number ? ?
5
 A A A A A
 B B B B
 C C C
 D D
 E
*/
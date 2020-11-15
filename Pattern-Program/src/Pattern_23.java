import java.util.Scanner;

public class Pattern_23 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ? ?");
		int number=sc.nextInt();
		for(int i=0;i<=number-1;i++)
		{
			for(int j=number-1;j>=i;j--)
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
 E D C B A
 E D C B
 E D C
 E D
 E
*/

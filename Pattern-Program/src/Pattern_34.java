import java.util.Scanner;

public class Pattern_34 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ?  ?");
		int number=sc.nextInt();
		for(int i=number-1;i>=0;i--)
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
Enter Any Number ?  ?
5
 A B C D E
   A B C D
     A B C
       A B
         A
*/
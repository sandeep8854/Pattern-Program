import java.util.Scanner;

public class Pattern_27
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ? ?");
		int number=sc.nextInt();
		for(int i=0;i<=number;i++)
		{
			for(int j=number-1;j>=i;j--)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(" "+k);
			}
			System.out.println();
		}	
	}
}
/*
Enter Any Number ? ?
5
          
         1
       1 2
     1 2 3
   1 2 3 4
 1 2 3 4 5
*/
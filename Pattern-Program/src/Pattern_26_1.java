import java.util.Scanner;

public class Pattern_26_1 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ? ?");
		int number=sc.nextInt();
		for(int i=1;i<=number;i++)
		{
			for(int j=number-1;j>=i;j--)
			{
				System.out.print("  ");
			}
			for(int k=0;k<i;k++)
			{
				System.out.print(" "+i);
			}
			System.out.println();
		}
	}
}
/*
Enter Any Number ? ?
9
                 1
               2 2
             3 3 3
           4 4 4 4
         5 5 5 5 5
       6 6 6 6 6 6
     7 7 7 7 7 7 7
   8 8 8 8 8 8 8 8
 9 9 9 9 9 9 9 9 9
*/

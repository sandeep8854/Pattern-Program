import java.util.Scanner;

public class Pattern_36_Piramid_2 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number  ?  ?");
		int number=sc.nextInt();
		for(int i=number;i>0;i--)	
		{
			for(int j=1;j<=number-i;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print(" "+ "*");
			}
			System.out.println();
		}
	}
}
/*
Enter Any Number  ?  ?
5
 * * * * * * * * *
   * * * * * * *
     * * * * *
       * * *
         *
*/
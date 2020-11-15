import java.util.Scanner;

public class Pattern_35_Piramid {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number  ?  ?");
		int number=sc.nextInt();
    	for(int i=1;i<=number;i++)
		{
			for(int j=1;j<=number-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++)
			{
			System.out.print("*");
			//	System.out.print(" "+(char)(k+65));
			}
			System.out.println();
		}
	}
}
/*
Enter Any Number  ?  ?
10
                   *
                 * * *
               * * * * *
             * * * * * * *
           * * * * * * * * *
         * * * * * * * * * * *
       * * * * * * * * * * * * *
     * * * * * * * * * * * * * * *
   * * * * * * * * * * * * * * * * *
 * * * * * * * * * * * * * * * * * * *
*/
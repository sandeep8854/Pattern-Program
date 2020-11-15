import java.util.Scanner;

public class Pattern_24 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ? ?");
		int number=sc.nextInt();
		for(int i=0;i<number;i++) //Ist logic throuth for loop
		{
			for(int j=number-1;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		} 
		// Second logic r=througth if else conditions
	/*	for(int i=0;i<number;i++)
		{
			for(int j=number;j>=0;j--)
			{
				if(i>=j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}	
			}
			System.out.println();*/
		//}
	}
}
/*
Enter Any Number ? ?
5
     *
    **
   ***
  ****
 *****
*/

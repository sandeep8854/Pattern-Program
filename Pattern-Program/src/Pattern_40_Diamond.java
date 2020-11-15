import java.util.Scanner;

public class Pattern_40_Diamond {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Odd Number ? ? ?");
		int number=sc.nextInt();
		int spaces=number/2;
		int star=1;
		for(int i=1;i<=number;i++)
		{
			for(int j=1;j<=spaces;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<=number/2)
			{
				spaces--;
 				star=star+2;
			}
			else 
			{
				spaces++;
			star=star-2;
			}
		}
	}
}
/*
Enter Any Odd Number ? ? ?
7
   *
  ***
 *****
*******
 *****
  ***
   *
*/
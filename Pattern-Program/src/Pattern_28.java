import java.util.*;
public class Pattern_28
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ? ? ");
		int number=sc.nextInt();
		for(int i=0;i<number;i++)
		{
			for(int j=number-1;j>i;j--)
			{
				System.out.print("  ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print(" "+(char)(i+65));
			}
			System.out.println();
			
		}	
	}
}
/*
Enter Any Number ? ? 
5
         A
       B B
     C C C
   D D D D
 E E E E E
 */
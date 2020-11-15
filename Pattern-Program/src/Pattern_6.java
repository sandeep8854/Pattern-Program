import java.util.*;
public class Pattern_6
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ? ?");
		int number=sc.nextInt();
		for(int i=number;i>=1;i--)
		{
			for(int j=number;j>=1;j--)
			{
				System.out.print(" "+j);
			}
			System.out.println();
		}
	}
}
/*
Enter Any Number ? ?
5
 5 4 3 2 1
 5 4 3 2 1
 5 4 3 2 1
 5 4 3 2 1
 5 4 3 2 1
*/
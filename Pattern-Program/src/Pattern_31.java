import java.util.Scanner;

public class Pattern_31 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ??");
		int number=sc.nextInt();
		for(int i=number;i>=1;i--)
		{
			for(int j=number-1;j>=i;j--)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(" "+i);
			}
			System.out.println();
		}
	}
}

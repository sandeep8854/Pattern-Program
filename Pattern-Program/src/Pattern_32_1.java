import java.util.Scanner;

public class Pattern_32_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ??");
		int number=sc.nextInt();
		for(int i=number;i>=1;i--)
		{
			for(int j=number;j>=1;j--)
			{
				if(i>=j)
				{
					System.out.print(" "+j);
				}
				else
				{
					System.out.print("  ");
				}	
			}
			System.out.println();
		}
	}
}
/*
Enter Any Number ??
5
 5 4 3 2 1
   4 3 2 1
     3 2 1
       2 1
         1
*/
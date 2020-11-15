import java.util.Scanner;

public class pattern_33 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ? ?");
		int number=sc.nextInt();
		for(int i=number-1;i>=0;i--)
		{
			for(int j=number-1;j>=i;j--)
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
   E E E E E
     D D D D
       C C C
         B B
           A
           */

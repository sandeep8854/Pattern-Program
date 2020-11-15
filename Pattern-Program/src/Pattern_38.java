import java.util.Scanner;

public class Pattern_38 {

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
			for(int k=0;k<2*i-1;k++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
/*
Enter Any Number  ?  ?
5
    1
   222
  33333
 4444444
555555555
*/
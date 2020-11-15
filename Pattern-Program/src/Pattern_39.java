import java.util.Scanner;

public class Pattern_39 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number  ? ?");
		int number=sc.nextInt();
		int z=1;
		for(int i=0;i<number;i++)
		{
			for(int j=number-1;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=z;k++)
			{
				System.out.print(z);
			}
			z=z+2;
			System.out.println();
		}
	}
}
/*
Enter Any Number  ? ?
5
    1
   333
  55555
 7777777
999999999
*/
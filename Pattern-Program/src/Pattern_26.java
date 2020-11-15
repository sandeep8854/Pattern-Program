import java.util.Scanner;

public class Pattern_26 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ? ? ?");
		int number=sc.nextInt();
		for(int i=1;i<=number;i++)
		{
			for(int j=number;j>=1;j--)
			{
				if(i>=j)
				{
					System.out.print(i);
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
/*
Enter Any Number ? ? ?
5
    1
   22
  333
 4444
55555
*/

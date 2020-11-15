import java.util.Scanner;

public class Pattern_37 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ? ?");
		int number=sc.nextInt();
		for(int i=0;i<number;i++)
		{
			for(int j=0;j<=number-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<2*i-1;k++)
			{
				System.out.print((char)(k+65));			
			}
			System.out.println();
		}
	}
}
/*
Enter Any Number ? ?
5
      
     A
    ABC
   ABCDE
  ABCDEFG
*/
import java.util.Scanner;

public class Pattern_30_1 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number ??");
		int number=sc.nextInt();
		for(int i=number;i>=1;i--)
		{
			for(int j=number;j>=1;j--)
			{
				if(i>=j)
				{
					System.out.print("*");
				}else
				{
					System.out.print(" ");
				}		    
			}
			System.out.println();
		}
	}
}
/*
Enter Any Number ??
10
**********
 *********
  ********
   *******
    ******
     *****
      ****
       ***
        **
         *
*/
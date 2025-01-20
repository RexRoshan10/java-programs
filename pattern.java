import java.io.*;
import java.util.Scanner;

public class Q1{
	


	public static void main(String args[])
	{

		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();


		int s=0;
		for(int i=0;i<n-1;i++)
		{
	
			for(int j=0;j<i;j++)
			{
				
					
					System.out.print("* ");
					System.out.print(" ");
				
				
	
			}

			System.out.println("" );
		
			if(i==n-2)
			break;
			for(int j=0;j<i;j++)
			{
				
					
					System.out.print(" ");
					System.out.print("* ");
				
				
	
			}

			System.out.println("");

		}

		for(int i=n-3;i>0;i--)
		{
			//if(i==n-2)
			//	continue;
			for(int j=0;j<i;j++)
			{
				
					
					System.out.print(" ");
					System.out.print("* ");
				
				
	
			}

			System.out.println("" );

			for(int j=0;j<i;j++)
			{
				
					
					System.out.print("* ");
					System.out.print(" ");
				
				
	
			}

			System.out.println("");

		}


	}
}
import java.io.*;
import java.util.Scanner;

public class Q2{

	static void fibo(int n)
	{
		if(n==3 || n==2 || n==5)
		{
			System.out.println("it is not possible without consecutive fibo values " );
			return ;
		}

		int first=0;
		int second=1;
		int nx=0;
		int no,n1;
		while(nx < n)
		{
			nx=first+second;
			first=second;
			second=nx;
		}
		System.out.print(first+"+");
		int new1=first;
		no=n-first;
		first=0;
		second=1;
		nx=0;
		while(nx < no)
		{
			nx=first+second;
			first=second;
			second=nx;
		}
		System.out.print(first+"+");
		n1=first;
		
		int n2=n-new1-n1;
		System.out.print(n2);
		
	}

	public static void main(String args[])
	{

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		fibo(n);

	}
}
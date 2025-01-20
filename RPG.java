import java.io.*;
import java.util.Scanner;

public class RPG{




	public static void main(String  args[])
	{

		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		int initial=sc.nextInt();

		int mp[]=new int[n];
		int mb[]=new int[n];

		for(int i =0;i<n;i++)
		{
			mp[i]=sc.nextInt();
			
		}

		for(int i=0;i<n;i++)
		{
			mb[i]=sc.nextInt();
		}

		int temp,t;
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=i;j<n;j++)
			{

				if(mp[i]>=mp[j])
				{
					temp=mp[j];
					mp[j]=mp[i];
					mp[i]=temp;
		
					t=mb[j];
					mb[j]=mb[i];
					mb[i]=t;
					
	
				}
			}
		}
		
		int i=0;	
		int count=0;
		while(initial >= mp[i])
		{
			System.out.println("Monster number "+ (i+1) +"is Defeated");
			count++;
			initial+=mb[i];	
			i++;
			System.out.println("current power of a man is "+ initial );
			if(i>n-1)
				break;
		}

		System.out.println(count);
	}



}
import java.io.*;
import java.util.Scanner;
import java.util.*;


public class Q3{

	static HashMap<String,String> createMap(HashMap<String,String> hm)
	{
		hm.put("zo","zoho");
		hm.put("a","and");
		hm.put("in","invoice");
		hm.put("bk","books");
		hm.put("exp","expense");
		hm.put("io","inventory");


		return hm;
	}


	public static void main(String args[])
	{
	
		HashMap<String,String> hm=new HashMap<String,String>();

		hm=createMap(hm);

		Scanner sc=new Scanner(System.in);

		String s=sc.next();

		char arr[]=new char[s.length()];
		arr=s.toCharArray();
		int st=0;
		String q="";

		while(st<arr.length)
		{
			 q+=arr[st];
			if(hm.containsKey(q))
			{
				System.out.print(hm.get(q)+" ");
				q="";
				st++;
			}
			else
				st++;
		}

	}

}
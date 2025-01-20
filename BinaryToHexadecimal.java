import java.io.*;
import java.util.*;

public class BinaryToHexadecimal{


	static void createBinary(HashMap<String,Character> um)
	{
	    um.put("0000", '0'); 
    		um.put("0001", '1'); 
   	 um.put("0010", '2'); 
    um.put("0011", '3'); 
    um.put("0100", '4'); 
    um.put("0101", '5'); 
    um.put("0110", '6'); 
    um.put("0111", '7'); 
    um.put("1000", '8'); 
    um.put("1001", '9'); 
    um.put("1010", 'A'); 
    um.put("1011", 'B'); 
    um.put("1100", 'C'); 
    um.put("1101", 'D'); 
    um.put("1110", 'E'); 
    um.put("1111", 'F');
	}

	static String binToHex(String bin)
	{
		int l=bin.length();
		int t=bin.indexOf('.');

		int len_left=t!=-1?t:l;

		int rem=(4-len_left %4)%4;

		if(rem!=0)
		{
			for(int i=0;i<rem;i++)
			{
				bin='0'+bin;
			}
		}
	
		String hex="";
		int i=0;
		HashMap<String,Character> hm= new HashMap<>();
		createBinary(hm);
		System.out.println(bin);

		while(true)
		{
			String sub=bin.substring(i,i+4);
			hex=hex+hm.get(sub);
			//System.out.println(hex);
			i=i+4;
			if(i==bin.length())
				break;
		}
		return hex;
	}

	public static void main(String args[])
	{
		String bin= "1111001010010100001";
		System.out.println("Hex value is "+binToHex(bin));
	}
}
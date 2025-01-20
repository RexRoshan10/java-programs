import java.io.*;
import java.util.Scanner;

class Student{
	public  int regno;
	Scanner s = new Scanner(System.in);
	public void getDetail(){
		regno=s.nextInt();
		}
	public void display()
	{
		System.out.println("The Regno is  "+ regno);
	}
}
public class ArrayofObjects{
		public static void main(String args[]){
			Student  s[]=new Student[10];
			for(int i=0;i<10;i++)
			{
				s[i]=new Student();
				s[i].getDetail();
			}
			for(int i=0;i<10;i++)
			{
				s[i].display();
			}
		}
}
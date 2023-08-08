import java.util.Scanner;
public class A
{
	public static void main(String args[])
	{
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1 number");
		a=sc.nextInt();
		if(a%2==0)
		{
		System.out.println("even number");
		}
		else
		{
		System.out.println("odd number");
		}
	}
} 
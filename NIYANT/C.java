import java.util.Scanner;
class C
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 values");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a;
		a=b;
		b=c;
		System.out.println("after swaping values are "+a);
		System.out.println("after swaping values are "+b);
		}
	} 
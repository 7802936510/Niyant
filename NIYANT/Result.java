import java.util.Scanner;
class Result
{
	public static void main(String args[])
	{
		int a,sum=0,b;
		String name;
		float per;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter your name"); 
		name=sc.nextLine();
		for(a=1;a<=4;a++)
		{
			System.out.println("enter marks of sub "+a); 
			b=sc.nextInt();
			sum+=b; 
		}
		System.out.println("sum is: "+sum);  
		per=sum/4;
		System.out.println("per is: "+per);
		
		if(per>70)
		{
			System.out.println("you got A+ grade");
		}
		else if(per<70 && per>60)
		{
			System.out.println("you got B grade"); 
		}
		else if(per<60 && per>50)
		{
			System.out.println("you are pass"); 
		}
		else
		{
			System.out.println("you are fail");
		}
	}
} 
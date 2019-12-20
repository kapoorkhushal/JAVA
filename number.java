import java.lang.Math;
import java.util.Scanner;

class function
{
	int num;
	function(int ... x)
	{
		num = x[0];
	}
	void factorial()
	{
		int fact,index = 1;
		if(0 == num)
			System.out.println("\nFactorial of the 0 is : 1\n");
		else
		{
			fact=num;
			while(index<num)
			{
				fact=fact*index;
				index++;
			}
			System.out.println("\nFactorial of the"+num+" is : "+fact+"\n\n");
		}
	}
	void prime()
	{
		int clk=(int)Math.sqrt(num);
		int flag = 0;
		for(int i=2;i<=clk;i++)
		{
			if(num%i==0)
			{
				flag=1;break;
			}
			else
				flag=0;
		}
		if(1 == flag)
			System.out.println("\n"+num+" is not Prime!\n\n");
		else
			System.out.println("\n"+num+" is Prime!\n\n");
	}
	void fibonacci()
	{
		int a=1,b=1,i=1;
		System.out.print("\nThe fibonacci series is : \n"+b);
		while(i<num)
		{
			b=a+b;
			a=b-a;
			System.out.print("\t"+b);
			i++;
		}System.out.println();
	}
}

class number
{
	public static void main(String[] Args)
	{
		int num;
		int choice;
		Scanner s = new Scanner(System.in);
		System.out.println("\nMenu :: \n1.Factorial \n2.Prime Check \n3.Fibonacci Series");
		System.out.print("Enter Choice : ");
		choice = s.nextInt();
		System.out.print("\nNumber (or Count) : ");
		num = s.nextInt();
		function obj = new function(num);
		switch(choice)
		{
			case 1:
				obj.factorial();break;
			case 2:
				obj.prime();break;
			case 3:
				obj.fibonacci();break;
			default:
				System.out.println("Invalid Input !");
				break;
		}
	}
}

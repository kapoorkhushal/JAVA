import java.util.Scanner;

class function
{
	int num1,num2;
	int result=1,i=2;
	function(int ... x)
	{
		num1 = x[0];
		num2 = x[1];
	}
	int lcm()
	{
		if((1 == num1) && (1 == num2))
			return result;
		if((0 == num1%i) || (0 == num2%i))
		{
			result *= i;
			if((num1%i) == 0)
				num1 /= i;
			if((num2%i) == 0)
				num2 /= i;
		}
		else
			i++;
		return lcm();
	}
	int gcd()
	{
		if((num1 < i) || (num2 < i))
			return result;
		if((num1%i == 0) && (num2%i == 0))
		{
			result *= i;
			num1 /= i;
			num2 /= i;
		}
		else
			i++;
		return gcd();		
	}
}

class calculation
{
	public static void main(String[] Args)
	{
		int num1,num2;
		int choice;
		Scanner s = new Scanner(System.in);
		System.out.println("\nMenu :: \n1.LCM \n2.GCD");
		System.out.print("Enter Choice : ");
		choice = s.nextInt();
		System.out.print("\nNumber-I : ");
		num1 = s.nextInt();
		System.out.print("\nNumber-II : ");
		num2 = s.nextInt();
		function obj = new function(num1,num2);
		switch(choice)
		{
			case 1:
				System.out.println("LCM : "+obj.lcm());break;
			case 2:
				System.out.println("GCD : "+obj.gcd());break;
			default:
				System.out.println("Invalid Input !");
				break;
		}
	}
}

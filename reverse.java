import java.lang.Math;
import java.util.Scanner;


class reversenum
{
	int num;
	int result = 0,armstrong = 0;
	reversenum(int x)
	{
		num = x;
	}
	int calculation(int num)
	{
		if(num == 0)
			return 0;
		result = (result*10)+(num%10);
		armstrong += Math.pow(num%10,3);
		num /= 10;
		calculation(num);
		return result;
	}
	int armstrong(int num)
	{
		if(num == armstrong)
			return 1;
		else
			return 0;
	}
	int palendrome(int num)
	{
		if(num == result)
			return 1;
		else
			return 0;
	}
}

public class reverse
{
	public static void main(String[] args)
	{
		int num,ch;
		int result;
		Scanner s = new Scanner(System.in);
		System.out.print("Number : ");
		num = s.nextInt();
		reversenum obj = new reversenum(num);
		result = obj.calculation(num);
		System.out.println("Menu :: \n1.Reverse \n2.Armstrong \n3.Palendrome\n");
		System.out.print("Enter Your Choice : ");
		ch = s.nextInt();
		switch(ch)
		{
			case 1:
				System.out.println("\nReverse : "+result);break;
			case 2:
				if(0  == obj.armstrong(num))
					System.out.println("\nNumber is not an Armstrong!");
				else
					System.out.println("\nNumber is Armstrong!");break;
			case 3:
				if(0  == obj.palendrome(num))
					System.out.println("\nNumber is not an Palendrome!");
				else
					System.out.println("\nNumber is Palendrome!");break;
			default :
				System.out.println("Invalid Input !");
				break;
		}
	}
}

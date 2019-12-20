import java.lang.Math;
import java.util.Scanner;

class mathfunc
{
	int num;
	mathfunc()
	{
		System.out.println("Constructor is Envoked !");
	}
	double choice(int ch,double ... num)
	{
		double result=0;
		switch(ch)
		{
			case 1:
				for(double i : num)
					result +=i;
				return result;
			case 2:
				for(double i : num)
					result =i - result;
				result = -result;
				return result;
			case 3:
				result = 1;
				for(double i : num)
					result *=i;
				return result;
			case 4:
				result =num[0]/num[1];
				return result;
			case 5:
				result =Math.pow(num[0],num[1]);
				return result;
			case 6:
				result =Math.sqrt(num[0]);
				return result;
			case 7:
				result =Math.cbrt(num[0]);
				return result;
			case 8:
				result =Math.exp(num[0]);
				return result;
			case 9:
				result =Math.log(num[0]);
				return result;
			case 10:
				result =Math.log10(num[0]);
				return result;
			case 11:
				result =Math.sin(num[0]);
				return result;
			case 12:
				result =Math.cos(num[0]);
				return result;
			case 13:
				result =Math.tan(num[0]);
				return result;
			case 14:
				result =Math.abs(num[0]);
				return result;
			case 15:
				for(double i : num)
					result =Math.max(i,result);
				return result;
			case 16:
				result = num[0];
				for(double i : num)
					result =Math.min(i,result);
				return result;
			default :
				System.out.println("Invalid Input !");
				return 0;
		}
	}
}

public class maths
{
	public static void main(String []srgs)
	{
		int ch;
		char exit;
		double num1,num2,result;
		mathfunc obj = new mathfunc();
		Scanner s = new Scanner(System.in);
		System.out.println("Menu ::");
		System.out.println("1. Addition\n2. Subtraction \n3. Multiplication \n4. Division \n5. Power \n6. Square Root \n7. Cube Root \n8. Exponential \n9. Log \n10. Log10 \n11. Sine \n12. Cosine \n13. Tan \n14. Absolute \n15. Max \n16. Min");
		do{
		System.out.print("\nEnter your choice :");
		ch = s.nextInt();
		switch(ch)
		{
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 15:
			case 16:
				System.out.print("Num1 :");
				num1 = s.nextDouble();
				System.out.print("\nNum2 :");
				num2 = s.nextDouble();
				result = obj.choice(ch,num1,num2);
				System.out.println("Result : "+result);break;
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
			case 11:
			case 12:
			case 13:
			case 14:
				System.out.print("\nNumber :");
				num1 = s.nextDouble();
				result = obj.choice(ch,num1);
				System.out.println("Result : "+result);break;
			default :
				System.out.println("Invalid Input !");
				break;
		}
		System.out.print("Do you want to continue [Y/N] :");
		exit = s.next().charAt(0);
		}while(exit == 'y' || exit == 'Y');
	}
}

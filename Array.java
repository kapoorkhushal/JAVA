import java.util.Scanner;

class Array_function
{
	int Arr[],sum=0;
	Scanner s = new Scanner(System.in);
	int Array_Input(int size)
	{
		char ch;
		int count = 0;
		Arr = new int[size];
		do{
			System.out.print("Element at Position "+count+" : ");
			Arr[count] = s.nextInt();
			System.out.print("Do you want to continue [Y/N] : ");
			ch = s.next().charAt(0);
			count++;
		}while((ch == 'y' || ch == 'Y') && count<size);
		return count;
	}
	int Array_Display(int count,int index)
	{
		if(count == index)
			return 0;
		System.out.println("Number At "+index+" : "+Arr[index]);
		Array_Display(count,index+1);
		return 0;
	}
	int Array_Reverse_Display(int index)
	{
		System.out.println("Number At "+index+" : "+Arr[index]);
		if(0 == index)
			return 0;
		Array_Reverse_Display(index-1);
		return 0;
	}
	int Array_Sum(int index)
	{
		sum += Arr[index];
		if(0 == index)
			return sum;
		Array_Sum(index-1);
		return sum;
	}
	void minmax(int index)
	{	
		int max,min;
		max=Arr[0];
		min=Arr[0];
		for(int i=0;i<index;i++)
		{
			if(max < Arr[i])
				max=Arr[i];
			
			if(min > Arr[i])
				min=Arr[i];
			else 
				continue;	
		}
		System.out.println("Max : "+max+" & MIN : "+min+"\n\n");
	}
}

public class Array
{
	public static void main(String[] Args)
	{
		Scanner s = new Scanner(System.in);
		int MAX_size,count,choice;
		Array_function obj = new Array_function();
		System.out.print("Max size : ");
		MAX_size = s.nextInt();
		System.out.println("Array Input :: ");
		count = obj.Array_Input(MAX_size);
		System.out.println("MENU :: \n1.Array Display \n2.Reverse Order Display \n3.Sum of Elements\n4.Min-Max\n");
		System.out.print("Choice : ");
		choice = s.nextInt();
		switch(choice)
		{
			case 1:
				obj.Array_Display(count-1,0);break;
			case 2:
				obj.Array_Reverse_Display(count-1);break;
			case 3:
				int sum = obj.Array_Sum(count-1);
				System.out.println("Sum of Elements : "+sum);break;
			case 4:
				obj.minmax(count);break;
			default :
				System.out.println("Invalid Input !");
				break;
		}
	}
}

import java.util.Scanner;

class Search_function
{
	int MAX_Size,count = 0;
	int Array[];
	char exit;
	Scanner s = new Scanner(System.in);
	Search_function(int x)
	{
		MAX_Size = x;
		Array = new int[MAX_Size];
	}
	int Input()
	{
		System.out.println("Array Input ::");
		do{
			System.out.print("Element at "+count+" : ");
			Array[count] = s.nextInt();
			System.out.print("Do you want to continue [Y/N] : ");
			exit = s.next().charAt(0);
			count++;
		}while((exit == 'y' || exit == 'Y') && (count < MAX_Size));
		System.out.println();
		for(int i=0;i<count;i++)
			System.out.print(Array[i]+"\t");
		return count;
	}
	int Linear_Search(int index,int item)
	{
		if(item == Array[index])
			return index;
		else if(0 == index)
			return -1;
		return Linear_Search(index-1,item);
	}
	int Binary_Search(int item,int Beg,int End,int len)
	{
		int Mid = (Beg+End)/2;
		if(item == Array[Beg])
			return Beg;
		else if(item == Array[End])
			return End;
		else if(item == Array[Mid])
			return Mid;
		else if(Beg == End)
			return len;
		else if(item > Array[Mid])
			Binary_Search(item,Mid+1,End,len);
		else if(item < Array[Mid])
			Binary_Search(item,Beg,Mid-1,len);
		return 1;
	}
}

class Search
{
	public static void main(String[] Args)
	{
		int count,MAX_Size;
		int choice,index;
		char exit;
		Scanner s = new Scanner(System.in);
		System.out.print("\nMAX Size of Array : ");
		MAX_Size = s.nextInt();
		Search_function obj = new Search_function(MAX_Size);
		count = obj.Input();
		System.out.println("\n\nMenu :: \n1.Linear Search \n2.Binary Search");
		do{
			System.out.print("\nNumber to be Searched: ");
			int item = s.nextInt();
			System.out.print("Enter Method : ");
			choice = s.nextInt();
			switch(choice)
			{
				case 1:
					index = obj.Linear_Search(count-1,item);
					if(index == -1)
						System.out.print("Number does not Exist !");
					else
						System.out.print("Number Exist at "+index);
					break;
				case 2:
					index = obj.Binary_Search(item,0,count,count+1);
					if(index == count)
						System.out.print("Number does not Exist !");
					else
						System.out.print("Number Exist at "+index);
					break;
				default:
					System.out.println("Invalid Output !");break;
			}
			System.out.print("\nDo you want to continue [Y/N] : ");
			exit = s.next().charAt(0);
		}while(exit == 'y' || exit == 'Y');
	}
}


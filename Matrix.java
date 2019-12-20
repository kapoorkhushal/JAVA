import java.util.Scanner;

class Matrix_function
{
	int Matrix[][],Matrix1[][],Matrix2[][];
	int row1,column1,row2,column2;
	Scanner s = new Scanner(System.in);
	Matrix_function(int x,int y,int u,int v)
	{
		row1 = x;
		column1  = y;
		row2 = u;
		column2 = v;
	}
	void Matrix_Input(int cases)
	{
		switch(cases)
		{
			case 1:
				Matrix1 = new int[row1][column1];
				System.out.println("Matrix-I Input ::");
				for(int i=0;i<row1;i++)
					for(int j=0;j<column1;j++)
					{		
						System.out.print("Element at Position ["+i+"]["+j+"] : ");
						Matrix1[i][j] = s.nextInt();
					}
				break;
			case 2:
				Matrix2 = new int[row2][column2];
				System.out.println("Matrix-II Input ::");
				for(int i=0;i<row1;i++)
					for(int j=0;j<column1;j++)
					{		
						System.out.print("Element at Position ["+i+"]["+j+"] : ");
						Matrix2[i][j] = s.nextInt();
					}
				break;
		}
	}
	void Matrix_Display(int cases)
	{
		switch(cases)
		{
			case 1:
				System.out.println("Matrix-I Output ::");
				for(int i=0;i<row1;i++){
					for(int j=0;j<column1;j++)
					{		
						System.out.print(Matrix1[i][j]+"\t");
					}System.out.println();
				}break;
			case 2:
				System.out.println("Matrix-II Output ::");
				for(int i=0;i<row2;i++){
					for(int j=0;j<column2;j++)
					{		
						System.out.print(Matrix2[i][j]+"\t");
					}System.out.println();
				}break;
			case 3:
				System.out.println("\nResult ::");
				for(int i=0;i<row1;i++){
					for(int j=0;j<column2;j++)
					{		
						System.out.print(Matrix[i][j]+"\t");
					}System.out.println();
				}break;
		}
	}
	void Matrix_Addition()
	{
		if((row1 == row2) && (column1 == column2))
		{
			Matrix_Input(1);
			Matrix_Display(1);
			Matrix_Input(2);
			Matrix_Display(2);
			Matrix = new int[row1][column2];
			for(int i=0;i<row1;i++)
				for(int j=0;j<column1;j++)
					Matrix[i][j] = Matrix1[i][j] + Matrix2[i][j];
			Matrix_Display(3);
		}
		else
			System.out.println("Addition not Possible!");
	}
	void Matrix_Subtraction()
	{
		if((row1 == row2) && (column1 == column2))
		{
			Matrix_Input(1);
			Matrix_Display(1);
			Matrix_Input(2);
			Matrix_Display(2);
			Matrix = new int[row1][column2];
			for(int i=0;i<row1;i++)
				for(int j=0;j<column1;j++)
					Matrix[i][j] = Matrix1[i][j] - Matrix2[i][j];
			Matrix_Display(3);
		}
		else
			System.out.println("Subtraction not Possible!");
	}
	void Matrix_Transpose()
	{
		Matrix_Input(1);
		Matrix_Display(1);
		System.out.println("\nTranspose of Matrix ::");
		for(int i=0;i<column1;i++){
			for(int j=0;j<row1;j++)
			{		
				System.out.print(Matrix1[j][i]+"\t");
			}System.out.print("\n");
		}
	}
	void Matrix_Multiplication()
	{
		if(column1 == row2)
		{
			Matrix_Input(1);
			Matrix_Display(1);
			Matrix_Input(2);
			Matrix_Display(2);
			Matrix = new int[row1][column2];
			for(int i=0;i<row1;i++)
			{
				for(int j=0;j<column2;j++)
				{
					Matrix[i][j]=0;
					for(int k=0;k<column1;k++)
						Matrix[i][j]=Matrix[i][j]+(Matrix1[i][k]*Matrix2[k][j]);
				}
			}
			Matrix_Display(3);
		}
		else
			System.out.println("Matrix can't be multiplied!\n");
	}
}

public class Matrix
{
	public static void main(String[] Args)
	{
		Scanner s = new Scanner(System.in);
		int choice,row1,column1,row2,column2;
		System.out.println("MENU :: \n1.Matrix Addition \n2.Matrix Subtraction \n3.Matrix Transpose \n4.Matrix Multiplication\n");
		System.out.print("Choice : ");
		choice = s.nextInt();
		switch(choice)
		{
			case 1:
				System.out.print("\nRow of Matrix-I : ");
				row1 = s.nextInt();
				System.out.print("\nColumn of Matrix-I : ");
				column1 = s.nextInt();
				System.out.print("\nRow of Matrix-II : ");
				row2 = s.nextInt();
				System.out.print("\nColumn of Matrix-II : ");
				column2 = s.nextInt();
				Matrix_function obj = new Matrix_function(row1,column1,row2,column2);
				obj.Matrix_Addition();break;
			case 2:
				System.out.print("\nRow of Matrix-I : ");
				row1 = s.nextInt();
				System.out.print("\nColumn of Matrix-I : ");
				column1 = s.nextInt();
				System.out.print("\nRow of Matrix-II : ");
				row2 = s.nextInt();
				System.out.print("\nColumn of Matrix-II : ");
				column2 = s.nextInt();
				Matrix_function obj1 = new Matrix_function(row1,column1,row2,column2);
				obj1.Matrix_Subtraction();break;
			case 3:
				System.out.print("\nRow of Matrix-I : ");
				row1 = s.nextInt();
				System.out.print("\nColumn of Matrix-I : ");
				column1 = s.nextInt();
				Matrix_function obj2 = new Matrix_function(row1,column1,0,0);
				obj2.Matrix_Transpose();break;
			case 4:
				System.out.print("\nRow of Matrix-I : ");
				row1 = s.nextInt();
				System.out.print("\nColumn of Matrix-I : ");
				column1 = s.nextInt();
				System.out.print("\nRow of Matrix-II : ");
				row2 = s.nextInt();
				System.out.print("\nColumn of Matrix-II : ");
				column2 = s.nextInt();
				Matrix_function obj3 = new Matrix_function(row1,column1,row2,column2);
				obj3.Matrix_Multiplication();break;
			default :
				System.out.println("Invalid Input !");
				break;
		}
	}
}

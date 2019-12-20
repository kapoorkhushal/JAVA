
public class pattern
{
	public static void main(String[] Args)
	{
		System.out.println("\nTo print various pattern pyramids\n");
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}System.out.println("\n");
		for(int i=6;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5-i;j++)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
				System.out.print("* ");
			System.out.println();
		}
	}
}

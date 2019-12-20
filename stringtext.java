import java.util.Scanner;
import java.io.*;
import java.util.regex.*;

public class stringtext
{
	public static void main(String[] args)throws IOException
	{
		char exit;
		String text1,text2;
		int ch;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner s = new Scanner(System.in);
		System.out.println("Menu ::");
		System.out.println("1. String Compare\n2. String Concatenate \n3. Trim \n4. Upper - Lower Case \n5. String Empty \n6. Substring \n7. Hashcode \n8. String Equality \n9. String Equality (ignore case) \n10. String Length \n11. String Matches \n12. Char position \n13. Char in Unicode \n14. String Contains \n15. String Split \n16. Char Replacement \n");
		do{
			System.out.print("\nEnter your choice :");
			ch = s.nextInt();
			switch(ch)
			{
				case 1:
					System.out.print("\nString1 : ");
					text1 = br.readLine();
					System.out.print("\nString2 : ");
					text2 = br.readLine();
					System.out.println("\nComparison Status values : "+text1.compareTo(text2));break;

				case 2:
					System.out.print("\nString1 : ");
					text1 = br.readLine();
					System.out.print("\nString2 : ");
					text2 = br.readLine();
					System.out.println("\nConcatenated Text : "+text1+" "+text2);break;
				case 3:
					System.out.print("\nString : ");
					text1 = br.readLine();
					System.out.println("Trimmed Text : "+text1.trim());break;
				case 4:
					System.out.print("\nString : ");
					text1 = br.readLine();
					System.out.println("Upper Case : "+text1.toUpperCase());
					System.out.println("Lower Case : "+text1.toLowerCase());break;
				case 5:
					System.out.print("\nString : ");
					text1 = br.readLine();
					System.out.println("\nString-Empty Status : "+text1.isEmpty());break;
				case 6:
					int start_index,end_index;
					System.out.print("\nString : ");
					text1 = br.readLine();
					System.out.print("\nStart Index : ");
					start_index = s.nextInt();
					System.out.print("\nStart Index : ");
					end_index = s.nextInt();
					System.out.println("\nSub-String : "+text1.substring(start_index,end_index));break;
				case 7:
					System.out.print("\nString : ");
					text1 = br.readLine();
					System.out.println("\nHashcode : "+text1.hashCode());break;
				case 8:
					System.out.print("\nString1 : ");
					text1 = br.readLine();
					System.out.print("\nString2 : ");
					text2 = br.readLine();
					System.out.println("\nEquality Status : "+text1.equals(text2));break;
				case 9:
					System.out.print("\nString1 : ");
					text1 = br.readLine();
					System.out.print("\nString2 : ");
					text2 = br.readLine();
					System.out.println("\nEquality Status : "+text1.equalsIgnoreCase(text2));break;
				case 10:
					System.out.print("\nString : ");
					text1 = br.readLine();
					System.out.println("\nLength of the String : "+text1.length());break;
				case 11:
					System.out.print("\nString1 : ");
					text1 = br.readLine();
					System.out.print("\nString2 : ");
					text2 = br.readLine();
					System.out.println("\nLength of the String : "+text1.matches("(.*)"+text2)+"(.*)");break;
				case 12:
					int num;
					System.out.print("\nString : ");
					text1 = br.readLine();
					System.out.print("\nPosition : ");
					num = s.nextInt();
					System.out.println("\nChar at index " + num + " : "+text1.charAt(num));break;
				case 13:
					char alphabet;
					System.out.print("\nAlphabet : ");
					alphabet = s.next().charAt(0);
					System.out.println("\nUnicode : "+(int)alphabet);break;
				case 14:
					System.out.print("\nString1 : ");
					text1 = br.readLine();
					System.out.print("\nString2 : ");
					text2 = br.readLine();
					System.out.println("\nContained Status : "+text1.contains(text2));break;
				case 15:
					Pattern pat = Pattern.compile("[ ,*;/.!]");
					System.out.print("\nString : ");
					text1 = br.readLine();
					String strs[] = pat.split(text1);
					for(int i=0; i < strs.length; i++)
						System.out.println("Next token: " + strs[i]);break;
				case 16:
					char original,replaced;
					System.out.print("\nString : ");
					text1 = br.readLine();
					System.out.print("\nOriginal Character : ");
					original = s.next().charAt(0);
					System.out.print("\nReplaced Character : ");
					replaced = s.next().charAt(0);
					System.out.println("Final Text : "+text1.replace(original,replaced));break;
				default :
				System.out.println("Invalid Input !");
				break;
			}
			System.out.print("Do you want to continue [Y/N] : ");
			exit = s.next().charAt(0);
		}while(exit == 'y' || exit == 'Y');
	}
}

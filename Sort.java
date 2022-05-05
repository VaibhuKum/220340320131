import java.util.*;

public class Sort
{
	public static void Insert(int[] ar)
	{
		int length = ar.length;
		int eleInsert = ar[length-1];
		for(int i= length-2; i>=0; i--)
		{
			if(ar[i] > eleInsert)
			{
				ar[i+1] = ar[i];
				printArray(ar);
				
			}
			else
			{
				ar[i+1]= eleInsert;
				printArray(ar);
				break;
			}
			if((i == 0)&&(ar[i]>eleInsert))
			{
				ar[i]= eleInsert;
				printArray(ar);
				
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner V1 = new Scanner(System.in);
		int s = V1.nextInt();
		int[] ar = new int[s];
		for(int i= 0; i< s; i++)
		{
			ar[i] = V1.nextInt();
			
		}
		Insert(ar);
		V1.close();
		
	}
	private static void printArray(int[] ar)
	{
		for(int n:ar)
		{
			System.out.print(n+" ");
			
		}
		System.out.println(" ");
	}
}


//Program to display tower of Hanoi on the output screen.
import java.util.*;
public class java6
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the block number : ");
		int n = sc.nextInt();
		for(int i=0 ; i<n ; i++)
		{
			for(int j=0 ; j<n-i ; j++)
			{
				System.out.print(" ");
			}
			for(int k=i ; k<2*i+1 ; k++)
			{
				System.out.print("**");
			}
			System.out.println("");
		}
	}
}

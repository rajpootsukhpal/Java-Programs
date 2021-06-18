//WAP to determine the roots of quadratic equations by taking inputs from the user. 
import java.util.Scanner;

public class java1
{
	
	public static void main(String args[])
	{
		double D,r,x1,x2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a : ");
		double a=sc.nextDouble();
		System.out.println("Enter value of b : ");
		double b=sc.nextDouble();
		System.out.println("Enter value of c : ");
		double c=sc.nextDouble();
		D=Math.pow(b,2)-4*a*c;
		if (D>0)
		{
			r=Math.sqrt(D);
			System.out.println("Roots of given equation are " + ((-b+r)/2) + " and " + ((-b-r)/2));
		}
		else if (D<0)
		{
			r=Math.sqrt(-D);
			System.out.println("Roots of given equation are " + (-b/2)+ "+" +(r/2)+"i" + " and " + (-b/2)  + (-r/2)+"i");
		}
		else
		{
		System.out.println("Roots of given equation are " + (-b/2) + " and " + (-b/2));
		}	
	}
}
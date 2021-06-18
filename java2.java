//Find roots of a quadratic equation through Command Line Arguments.
import java.util.Scanner;

public class java2
{
	
	public static void main(String args[])
	{
		double D,r,x1,x2;
		double a = Integer.parseInt(args[0]);
		double b = Integer.parseInt(args[1]);
		double c = Integer.parseInt(args[2]);
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


//Print Fibonacci series recursively.

import java.util.Scanner;


public class java5
{
    
 
    
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
	System.out.println("How many terms you want to see? ");
        int n = sc.nextInt();
        int a=0,b=1,c=1;

	System.out.println("\nHey! see below not here ");
	System.out.println("\n\t\t|");
	System.out.println("\t\tV\n");
	System.out.print("\t");

	System.out.print(a + " " );
   	for(int i=1;i<n;i++)
        {
	    System.out.print(c + " ");
	    c=a+b;
            a=b;
            b=c;
        }
	System.out.println("\n");
    }	    
}

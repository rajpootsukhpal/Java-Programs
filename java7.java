//Program to reverse the digits of number and sum of digits using string functions.

import java.util.Scanner;
public class java7
{
    public static void main(String[] args)
    {
	StringBuilder st = new StringBuilder();
	String str = new String();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number:");
        str = sc.next();
	st.append(str);
	int sum = 0;
	for(int i = 0, j=1 ; i < str.length() ; i++,j++)
	{
		
		sum = sum + Integer.parseInt(str.substring(i,j));
	}
        System.out.println("Reverse : " + st.reverse() );
        System.out.println("Sum of digits:"+(sum));
    }
}

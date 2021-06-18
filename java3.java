//WAP for showing the concept of method overloading.
import java.util.*;
public class java3
{

int area(int a)
{
return a*a;
}

double area(double a)
{
return 3.14*a*a;
}

double area(double a, double b)
{
return a*b;
}

double area(double a, double b, double c)
{
double s=(a+b+c)/2;
return Math.sqrt(s*(s-a)*(s-b)*(s-c));
}

	public static void main(String args[])
	{
		java3 obj = new java3();
		Scanner sc = new Scanner(System.in);
		int y=1;
		while(y==1)
		{
			System.out.print("\nEnter : \n1 : Area of Square\n2 : Area of Rectangle\n3 : Area of Triangle\n4 : Area of Circle\nEnter your choice : ");
			switch(sc.nextInt())
			{
				case 1 : 
					System.out.print("\nEnter side of Square : ");
					System.out.println("\nArea of Square is : " + obj.area(sc.nextInt()));
					break;

				case 2 : 
					System.out.print("\nEnter sides of Rectangle : ");
					System.out.println("\nArea of Rectangle is : " + obj.area(sc.nextDouble(), sc.nextDouble()));
					break;

				case 3 : 
					System.out.print("\nEnter sides of Triangle : ");
					System.out.println("\nArea of Triangle is : " + obj.area(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
					break;

				case 4 : 
					System.out.print("\nEnter Radius of Circle : ");
					System.out.println("\nArea of Circle is : " + obj.area(sc.nextDouble()));
					break;

				default : 
					System.out.println("\nEnter only 1, 2, 3 or 4 ");

			}
			System.out.print("\nIf you want to continue then press 1 : ");
			y=sc.nextInt();
		}
	}
}


/*
Implement a menu driven Statistical calculator for the following 
•	Mean
•	Harmonic Mean
•	Geometric Mean
•	Variance
•	Covariance
•	Regression coefficient
*/

import java.util.*;
class java11
{

public static void main(String args[])
{
int n , i ; 
double sum = 0 , sum1 = 0 , sum2 = 0 , sqsum = 0 , sqsum1 = 0, mul = 1, mean = 0, var = 0, frsum = 0;
int series[] = new int[1000];
int series1[] = new int[1000];
int freq[] = new int[1000];
String CI[] = new String[1000];
double mp[] = new double[1000];
Scanner sc = new Scanner(System.in);

int y = 1;
while(y == 1)
{
System.out.println("Enter : \n1 : Mean\n2 : Harmonic Mean\n3 : Geometrical Mean\n4 : Variance\n5 : Co-Variance\n6 : Regression Coefficient\nEnter your choice : ");
int ch = sc.nextInt();

switch (ch)
{
case 1 :
	System.out.println("Enter : \n1 : For Individual Data Series\n2 : For Discrete Data Series\n3 : For Continuous Data Series\nEnter your choice : ");
	int ch1 = sc.nextInt();
	switch (ch1)
	{
	case 1 :
		System.out.println("Enter no. of elements : ");
		n = sc.nextInt();
		System.out.println("Enter the values : ");
		for(i = 0 ; i < n ; i++)
		{
			series[i] = sc.nextInt();
			sum = sum + series[i];
		}
		mean = sum/n ;
		System.out.println("Mean = " + mean);
		break;
	case 2 :
		System.out.println("How many values the series have : ");
		n = sc.nextInt();
		System.out.println("Enter the elements of the series : ");
		for(i = 0 ; i < n ; i++)
		{
			series[i] = sc.nextInt();
		}
		System.out.println("Enter the frequencies : ");
		for(i = 0 ; i < n ; i++)
		{
			freq[i] = sc.nextInt();
			frsum = frsum + freq[i];
		}
		for(i = 0 ; i < n ; i++)
		{
			sum = sum + freq[i]*series[i];
		}
		mean = sum/frsum ;
		System.out.println("Mean = " + mean);
		break;

	case 3 : 
		System.out.println("How many values the series have : ");
		n = sc.nextInt();
		System.out.println("Enter the Class Intervals : ");
		for(i = 0 ; i < n ; i++)
		{
			CI[i] = sc.next();
			mp[i] = (Integer.parseInt(CI[i].substring(0,1)) + Integer.parseInt(CI[i].substring(2))/2);
		}
		System.out.println("Enter the frequencies : ");
		for(i = 0 ; i < n ; i++)
		{
			freq[i] = sc.nextInt();
			frsum = frsum + freq[i];
		}
		for(i = 0 ; i < n ; i++)
		{
			sum = sum + freq[i]*mp[i];
		}
		mean = sum/frsum ;
		System.out.println("Mean = " + mean);
		break;
	}
	break;
case 2 : 
	System.out.println("Enter no. of elements : ");
	n = sc.nextInt();
	System.out.println("Enter the values : ");
	for(i = 0 ; i < n ; i++)
	{
		series[i] = sc.nextInt();
		sum = sum + 1/series[i];
	}
	mean = n/sum ;
	System.out.println("Harmonic Mean = " + mean);
	break;
case 3 : 
	System.out.println("Enter no. of elements : ");
	n = sc.nextInt();
	System.out.println("Enter the values : ");
	for(i = 0 ; i < n ; i++)
	{
		series[i] = sc.nextInt();
		mul = mul*series[i];
	}
	mean = Math.pow(mul,1/n);
	System.out.println("Geometric Mean = " + mean);
	break;
case 4 :
	System.out.println("Enter no. of elements : ");
	n = sc.nextInt();
	System.out.println("Enter the values : ");
	for(i = 0 ; i < n ; i++)
	{
		series[i] = sc.nextInt();
		sum = sum + series[i];
	}
	for(i = 0 ; i < n ; i++)
	{
		sqsum = sqsum + Math.pow(sum/n - series[i], 2);
	}
	var = sqsum/n;
	System.out.println("Variance = " + var);
	break;
case 5 :
	System.out.println("Enter no. of elements : ");
	n = sc.nextInt();
	System.out.println("Enter the values of X : ");
	for(i = 0 ; i < n ; i++)
	{
		series[i] = sc.nextInt();
		sum = sum + series[i];
	}
	System.out.println("Enter the values of Y : ");
	for(i = 0 ; i < n ; i++)
	{
		series1[i] = sc.nextInt();
		sum1 = sum1 + series1[i];
	}
	for(i = 0 ; i < n ; i++)
	{
		sqsum = sqsum + (sum/n - series[i])*(sum1/n - series1[i]);
	}
	System.out.println("Population Co-Variance = " + (double)sqsum/n + "\nSample Co-Variance = " + (double)sqsum/(n-1) );
	break;
case 6 :
	System.out.println("Enter no. of elements : ");
	n = sc.nextInt();
	System.out.println("Enter the values of X : ");
	for(i = 0 ; i < n ; i++)
	{
		series[i] = sc.nextInt();
		sum = sum + series[i];
		sqsum = sqsum + Math.pow(series[i],2);
	}
	System.out.println("Enter the values of Y : ");
	for(i = 0 ; i < n ; i++)
	{
		series1[i] = sc.nextInt();
		sum1 = sum1 + series1[i];
		sqsum1 = sqsum1 + Math.pow(series1[i],2);
	}
	for(i = 0 ; i < n ; i++)
	{
		sum2 = sum2 + series[i]*series1[i];
	}
	for(i = 0 ; i < n ; i++)
	{
		sqsum = sqsum + (sum/n - series[i])*(sum1/n - series1[i]);
	}
	System.out.println("Regression Co-Efficient = " + (double)((n*sum2 - sum*sum1)/(Math.pow((n*sqsum - Math.pow(sum,2))*(n*sqsum1 - Math.pow(sum1,2)),0.5))) );
	break;
default :
	System.out.println("Nice Try! ");
}
System.out.println("To try again, press(1) : ");
y = sc.nextInt();
}
}
}








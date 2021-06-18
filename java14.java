//Write a menu driven program to implement M|M|1 , M|M|C and M|M|infinity queuing models.

import java.io.*;

import java.util.*;



class design
{


	float po,pn,r,l,lq,w,wq,t,c,r1=0,r2=0;
int n;

	
	design()
	{

		n=0;  
		
	}



	void input()
	
	{
	 
		Scanner scanner =new Scanner(System.in);
	 
		System.out.println("enter the number of states:");
	 
		n=scanner.nextInt();
	
	} 


	
	float fact(int x)


	{

		if(x<=1)
	
			return (1);

		else 
	
			return (x*(fact(x-1)));

	}



	void MM1(float a,float s)
	
	{   
	
		r=a/s;
	
		System.out.println("r="+r);
	
		po=1-r;
	
		System.out.println("system is idle:"+po);
	 
		if(r<1 && n>=1)
		 
		{
		 
			pn=(float) (po*Math.pow(r,n));
		 
			System.out.println("\nqueue length:="+pn);
		 
		}
	 
		else
		
		{
 		
			System.out.println("cannot compute:");
 		
		}
	 
		System.out.println("measure of effectivess:");
 	 
		l= r/(1-r);
	 
		lq=(float) (Math.pow(r,2)/(1-r));
	
		w=r/(a*(1-r));
	 
		wq=(float) (Math.pow(r,2)/(a*(1-r)));
	 
		System.out.println("\nl="+l+"\nlq="+lq+"\nw="+w+"\nwq="+wq);
	
	}



	void MMC(float a,float s)
	
	{
	 
		Scanner g=new Scanner(System.in);  
	 
		System.out.println("enter the number of coustomers:");
	 
		c=g.nextInt();
	 
		r=a/s;
	 
		System.out.println("r="+r);
	 
		t=r/c;
	 
		System.out.println("cu="+t);
	  
		if(t<1)
	   
		{
	    
			for(int i=0;i<=c-1;i++)
	     
			{
	      
				r1=(float)(r1+Math.pow(r,i)/fact(i));
	     
			}
	  
			System.out.println("r1="+r1);
	  
			r2=(float)(Math.pow(r,c)/(fact((int) c)*(1-(r/c))));
	  
			System.out.println("r2="+r2);
	  
			po=1/(r1+r2);
	  
			System.out.println("System is idle="+po);
	 
		}
	  
		if(n<c)
	   
		{
	   
			pn=(float) (Math.pow(r,n)*po/(fact((int) n)));
	   
		}
	  
		else if(n>=c)
	  
		{
		  
			pn=(float) (Math.pow(r,n)*po/(fact((int) c)*Math.pow(c,n-c)));
	  
		}
		
else
	  
		{
	  
			System.out.println("cannot compute:");
	  
		}
	 
		System.out.println("queue length="+pn);
	 
		System.out.println("measure of effectivness:");
	 
		l=(float) (r+(Math.pow(r,c)*t*po/(fact((int) c)*Math.pow((1-t),2))));
	 
		lq=(float) (Math.pow(r,c)*t*po/(fact((int) c)*Math.pow((1-t),2)));
	 
		w=(float) ((1/s)+Math.pow(r,c)*po/(fact((int) c)*Math.pow((1-t),2)*(c*s)));
		 
		wq=(float) (Math.pow(r,c)*po/(fact((int) c)*Math.pow((1-t),2)*(c*s)));
	  
		System.out.println("\nl="+l+"\nlq="+lq+"\nw="+w+"\nwq="+wq);

	}
	
	

	void MM(float a,float s)

	{

		r=a/s;

		System.out.println("\nr="+r);
 
		if(n>=0)
 
		{
     
			po=(float) (Math.exp(-r));
 
		}
 
		System.out.println("\nSystem is idle="+po);

		pn=(float) (Math.pow(r,n)*po/fact((int) n));

		System.out.println("\nqueue length="+pn);

		System.out.println("measure of effectivness:");

		l=a/s;

		lq=l-r;

		w=1/s;

		wq=lq/a;

		System.out.println("\nl="+l+"\nlq="+lq+"\nw="+w+"\nwq="+wq);

	}

}


class Queue 
{
    
	public static void main(String [] args)
   
	{
   
		design d;
   
		d = new design();
   
		int ch;

		String check;
   
		float a,s;
   
		Scanner k = new Scanner(System.in);
   
		System.out.println("enter the arrival rate:");
   
		a=k.nextFloat();
   
		System.out.println("enter the service rate:");
   
		s=k.nextFloat();
   
		d.input();

		do

		{
 
			Scanner in = new Scanner(System.in);

			Scanner ins = new Scanner(System.in);

			System.out.println("menu::::::::::");

			System.out.println("enter 1.model MM1");

			System.out.println("enter 2.model MMC");

			System.out.println("enter 3.model MM0 ");

			System.out.println("enter your choice");
     
			ch= in.nextInt();
     
			switch(ch)
        
			{
    
				case 1: 
					{
                 
						d.MM1(a,s);
                            
						break;
    
					}
    
				case 2:  
					{
                
						d.MMC(a,s);
                
						break;
    
					}
    
				case 3:     
                
					d.MM(a,s);
                    
					break;
    
				default:
        
					System.out.println("invalid choice :-) ");
        
			}

			System.out.println("do u want to continue(yes/no)");

			check=ins.nextLine();
       

		}
		while(check.equals("yes")||check.equals("Yes"));
   
	}

   

}




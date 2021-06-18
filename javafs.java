import java.util.*;

public class javafs

{

	public static void main(String args[])
	{
		int i,k,p1=0,p2=0,min1=0,minm=0,max=0,s=0,r,t;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter : No. of jobs : ");
		int j = sc.nextInt();
		System.out.println("Enter : No. of machines : ");
		int m = sc.nextInt();
		int tt[][] = new int[j][m];
		System.out.println("Enter Processing time for jobs on machines here rows are jobs : ");
		for(i=0;i<j;i++)
		{
			for(k=0;k<m;k++)
				{
					tt[i][k] = sc.nextInt();
				}
		}
		
		int jobseq[] = new int[j];
		int ntt[][] = new int[j][m];
		for(i=0;i<j;i++)
		{
			for(k=0;k<m;k++)
			{
				ntt[i][k] = tt[i][k]; 
			}
		}
		int gh[][] = new int[j][2];
		for(i=0;i<j;i++)
		{
			for(k=0;k<2;k++)
			{
				gh[i][k]=0;
			}
		}
		if(m>2)
		{
			min1=tt[0][0];
			minm=tt[0][m-1];
			max=tt[0][1];
			for(i=0;i<j;i++)
			{
				for(k=0;k<m;k++)
				{
					if(tt[i][k]<min1)
					{
						min1=tt[i][0];
					}
					
					if(tt[i][k]<minm)
					{
						min1=tt[i][m-1];
					}
					if(k!=0 && k!=(m-1) && tt[i][k]>max)
					{
						max=tt[i][k];
					}
				}
			}
			if(min1>max || minm>max)
			{
				System.out.println("Jonson's optimality rule will be applied.\n ");
			}
			else
			{
				System.out.println("Because of processing times jonson's optimality rule will not be applied !\nwe can't solve this question by this method\nBye Bye...");
				System.exit(0);
			}
			for(i=0;i<j;i++)
			{
				for(k=0;k<m-1;k++)
				{
					gh[i][0]=gh[i][0]+tt[i][k];
				}
				for(k=1;k<m;k++)
				{
					gh[i][1]=gh[i][1]+tt[i][k];
				}
			}
		}
		else
		{
			for(i=0;i<j;i++)
			{
				for(k=0;k<m;k++)
				{
					gh[i][k] = tt[i][k]; 
				}
			}
		}
		
		for(int j1=0,j2=0;j1+j2<j;)
		{
	        	int temp=gh[0][0],m1=0,m2=0;
			for(i=0;i<j;i++)
			{
	        		for(k=0;k<2;k++)
				{
					if (temp>gh[i][k])
					{
						temp=gh[i][k];
						m1=i;
						m2=k;
					}
				}
			}
			if (m2==0) {
			jobseq[j1]=m1+1;
			gh[m1][m2]*=10000;
			gh[m1][m2+1]*=10000;
			j1++;
			}
			else
			{
				jobseq[j-j2-1]=m1+1;
				gh[m1][m2]*=10000;
				gh[m1][m2-1]*=10000;
				j2++;
			}
		}
		System.out.print("Job sequence for machines is = ");
		for(i=0;i<j;i++)
		{
			System.out.print(jobseq[i]+" " );
		}
		System.out.println("");
		for(i=0;i<j;i++)
		{
			for(k=0;k<m;k++)
			{
				ntt[i][k]=tt[((jobseq[i])-1)][k];
			}
		}
		
		int sum[] = new int[m];
		int idle[] = new int[m];
		for(i=0;i<m;i++)
		{
			sum[i] = 0;
			idle[i] = 0;
		}		
	
		for(i=0;i<j;i++)
		{
			for(k=0;k<m;k++)
			{
				if(k==0)
				{				
					sum[0] = sum[0] + ntt[i][0];
				}
				else
				{
					if(sum[k-1]>sum[k])
					{
						idle[k]=idle[k]+(sum[k-1]-sum[k]);
						sum[k]=sum[k-1];
					}
					sum[k] = sum[k] + ntt[i][k];
				}
			}		
		}
		System.out.println("\nTotal elapsed time = " + sum[m-1]);
		for(i=1;i<m;i++)
		{
			System.out.println("\nIdle time for Machine " + (i+1) + " = " + idle[i]);
		}


	}
}


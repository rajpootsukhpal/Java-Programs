//Implement matrix class, Use methods for addition, subtraction, multiplication and transpose.
import java.util.*;
public class java10
{
	public static void main(String args[])
	{
		int r1=10,r2=10,c1=10,c2=10, i=0, j=0;
		Scanner sc = new Scanner(System.in);
		int y = 1;
		do
		{
			System.out.println("Enter :\n1 : Addition\n2 : Subtraction\n3 : Multiplication\n4 : Transpose\nPlease Enter your choice : ");
			int ch = sc.nextInt();
			int m1[][] = new int[r1][c1];
			int m2[][] = new int[r2][c2];
			int sum[][] = new int[Math.max(r1,r2)][Math.max(c1,c2)];
			int sub[][] = new int[Math.max(r1,r2)][Math.max(c1,c2)];
			int mul[][] = new int[Math.max(r1,r2)][Math.max(c1,c2)];
			int trans[][] = new int[c1][r1];
			
			switch(ch)
			{
				case 1:
					//ADDITION 
					System.out.print("\nEnter row size of matrix 1 :");
					r1 = sc.nextInt();
					System.out.print("\nEnter column size of matrix 1 :");
					c1 = sc.nextInt();
					System.out.print("\nEnter row size of matrix 2 :");
					r2 = sc.nextInt();
					System.out.print("\nEnter column size of matrix 2 :");
					c2 = sc.nextInt();
			 
					//INPUT FIRST MATRIX
					System.out.println("Enter the elements of first matrix");
			 		
					for (  i = 0 ; i < r1 ; i++ )
						for ( j = 0 ; j < c1 ; j++ )
							m1[i][j] = sc.nextInt();

			 		//INPUT SECOND MATRIX
					System.out.println("Enter the elements of second matrix"); 
					for ( i = 0 ; i < r2 ; i++ )
						for ( j = 0 ; j < c2 ; j++ )
							m2[i][j] = sc.nextInt();
					if ( r1==r2 && c1==c2 )
					{     
						for ( i = 0 ; i < Math.max(r1,r2) ; i++ )
							for ( j = 0 ; j < Math.max(c1,c2) ; j++ )
								sum[i][j] = m1[i][j] + m2[i][j];
						//PRINT SUMMATION OF MATRICES
						System.out.println("Sum of entered matrices:-"); 
						for ( i = 0 ; i < Math.max(r1,r2)  ; i++ )
						{
							for ( j = 0 ; j < Math.max(c1,c2)  ; j++ )
								System.out.print(sum[i][j]+"\t");
							System.out.println();
						}
					}
					else
					{
						System.out.println("Addition is not possible : ");
					}  
					break;
	 			case 2:
					//SUBTRACTION
					System.out.print("\nEnter row size of matrix 1 :");
					r1 = sc.nextInt();
					System.out.print("\nEnter column size of matrix 1 :");
					c1 = sc.nextInt();
					System.out.print("\nEnter row size of matrix 2 :");
					r2 = sc.nextInt();
					System.out.print("\nEnter column size of matrix 2 :");
					c2 = sc.nextInt();
			 
					//INPUT FIRST MATRIX
					System.out.println("Enter the elements of first matrix");
			 		
					for (  i = 0 ; i < r1 ; i++ )
						for ( j = 0 ; j < c1 ; j++ )
							m1[i][j] = sc.nextInt();

			 		//INPUT SECOND MATRIX
					System.out.println("Enter the elements of second matrix"); 
					for ( i = 0 ; i < r2 ; i++ )
						for ( j = 0 ; j < c2 ; j++ )
							m2[i][j] = sc.nextInt();
					if ( r1==r2 && c1==c2 )
					{     
						for ( i = 0 ; i < Math.max(r1,r2) ; i++ )
							for ( j = 0 ; j < Math.max(c1,c2) ; j++ )
								sub[i][j] = m1[i][j] - m2[i][j];
						//PRINT SUBTRACTION OF MATRICES
						System.out.println("Subtraction of entered matrices:-"); 
						for ( i = 0 ; i < Math.max(r1,r2)  ; i++ )
						{
							for ( j = 0 ; j < Math.max(c1,c2)  ; j++ )
								System.out.print(sub[i][j]+"\t");
							System.out.println();
						}
					}
					else
					{
						System.out.println("Subtraction is not possible : ");
					}  
					break;
				case 3:
	
					//MULTIPLICATION
					System.out.print("\nEnter row size of matrix 1 :");
					r1 = sc.nextInt();
					System.out.print("\nEnter column size of matrix 1 :");
					c1 = sc.nextInt();
					System.out.print("\nEnter row size of matrix 2 :");
					r2 = sc.nextInt();
					System.out.print("\nEnter column size of matrix 2 :");
					c2 = sc.nextInt();
			 
					//INPUT FIRST MATRIX
					System.out.println("Enter the elements of first matrix");
			 		
					for (  i = 0 ; i < r1 ; i++ )
						for ( j = 0 ; j < c1 ; j++ )
							m1[i][j] = sc.nextInt();

			 		//INPUT SECOND MATRIX
					System.out.println("Enter the elements of second matrix"); 
					for ( i = 0 ; i < r2 ; i++ )
						for ( j = 0 ; j < c2 ; j++ )
							m2[i][j] = sc.nextInt();
					if ( c1==r2 )
					{     
						for ( i = 0 ; i < Math.max(r1,r2) ; i++ )
							for ( j = 0 ; j < Math.max(c1,c2) ; j++ )
								for ( int k = 0 ; k < c2 ; k++ )
									mul[i][j] = mul[i][j] + m1[i][k] * m2[k][j];
			
						//PRINT MULTIPLICATION OF MATRICES
						System.out.println("Sum of entered matrices:-"); 
						for ( i = 0 ; i < Math.max(r1,r2)  ; i++ )
						{
							for ( j = 0 ; j < Math.max(c1,c2)  ; j++ )
								System.out.print(mul[i][j]+"\t");
							System.out.println();
						}
					}
					else
					{
						System.out.println("Multiplication is not possible : ");
					}
					break;
				case 4:
	  
					System.out.print("\nEnter row size of matrix :");
					r1 = sc.nextInt();
					System.out.print("\nEnter column size of matrix :");
					c1 = sc.nextInt();
					System.out.println("\nEnter the elements of matrix");
					for (  i = 0 ; i < r1 ; i++ )
						for ( j = 0 ; j < c1 ; j++ )
							m1[i][j] = sc.nextInt();
					System.out.println("Transpose of matrix:-");
					for ( i = 0 ; i < r1 ; i++ )
						for ( j = 0 ; j < c1 ; j++ )
							trans[j][i] = m1[i][j];
	
					for ( i = 0 ; i < c1 ; i++ )
					{
						for ( j = 0 ; j < r1 ; j++ )
							System.out.print(trans[i][j]+"\t");
						System.out.println();
					}
					break;
				default : 
					System.out.println("\nPlease enter a valid entry : ");
			}
			
			System.out.println("\nyou want to continue then press (1) : ");
			y=sc.nextInt();
			
		}
		while(y==1);
		
	}
	
}

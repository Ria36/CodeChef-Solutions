/* https://www.codechef.com/problems/SUMOFPROD1 */
/* Sum of Product 1 */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SumOfProduct1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int []arr=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		    }
		    long sum=0;
		    long count=0;
		    for(int i=0;i<n;i++){
		        if(arr[i]==1){
		            count++;
		        }
		        else{
		            sum=sum+(count*(count+1))/2;
		            count=0;
		        }
		    }
		    sum=sum+(count*(count+1))/2;
		    System.out.println(sum);
		}
	}
}

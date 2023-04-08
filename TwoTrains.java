/* https://www.codechef.com/problems/TWOTRAINS */
/* Two Trains */


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class TwoTrains
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		for(int i=0;i<T;i++)
		{
		    int n=in.nextInt();
		    int arr[]=new int[n];
		    int b[]=new int[n];
		    int sum=0,d=0;
		    for(int k=1;k<n;k++)
		    {
		        arr[k]=in.nextInt();
		        sum=sum+arr[k];
		        b[k]=arr[k];
		        arr[k]=sum;
		    }
		     for(int j=0;j<n-1;j++)
		     {
		         d=arr[j+1]-b[j];
		         if(d>0){
		             b[j+1]=b[j]+d+b[j+1];
		         }
		         else{
		             b[j+1]=b[j]+b[j+1];
		         }
		     }
		 System.out.println(b[n-1]);
		}
	}
}


/* https://www.codechef.com/problems/ICL1701 */
/* Cards Game */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CardsGame
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
		int k=sc.nextInt();
		int[] arr=new int[n];
		int[] res=new int[n];
		for(int i=0;i<n;i++)
		 arr[i]=sc.nextInt(); 
		int a=0,count=0,l=0;
		for(int i=0;i<n;i++){
		    if(i==n-1&&arr[i]<0){
		     arr[i]=-1*arr[i];
		     count++;
		     res[l]=i+1;
		     l++;
		    }
		    else{
		        if(arr[i]<0){
		            arr[i]=arr[i]*-1;
		            count++;
		            res[l]=i+1;
		            l++;
		            arr[i+1]=arr[i+1]*-1;
		        }
		    }
		}
		System.out.println(count);
		if(count>0)
		 for(int i=0;i<res.length;i++)
		  System.out.print(res[i]+" ");
	}
}

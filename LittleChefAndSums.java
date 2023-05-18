/* https://www.codechef.com/problems/CHEFSUM */
/* Little Chef and Sums */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class LittleChefAndSums
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
		    int a=sc.nextInt();
		    int arr[]=new int[a];
		    for(int j=0;j<a;j++){
		        arr[j]=sc.nextInt();
		    }
		    int res=0,cc=0,sum=0;
		    int k=Integer.MAX_VALUE;
		    for(int j=0;j<a;j++){
		        res=arr[j]+sum;
		        if(k>res){
		            k=res;
		            cc=j;
		        }
		    }
		    System.out.println(cc+1);
		}
	}
}

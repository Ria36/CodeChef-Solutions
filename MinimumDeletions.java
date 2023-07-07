/* https://www.codechef.com/problems/RD19 */
/* Minimum Deletions */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MinimumDeletions
{
	public static int GCD(int a,int b){
        if(b==0)
        return a;
        
        return GCD(b,a%b);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0){
		    int n=s.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=s.nextInt();
		    }
		    Arrays.sort(arr);
		    int a=arr[0];
		    for(int i=1;i<n;i++){
		        a=GCD(a,arr[i]);
		    }
		    if(a==1){
		        System.out.println(0);
		    }else{
		        System.out.println(-1);
		    }
		}
	}
}

/* Simple Statistics */
/* https://www.codechef.com/LP1TO205/problems/SIMPSTAT */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SimpleStatistics
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    int a[] = new int[n];
		    int sum = 0;
		    for(int i=0;i<n;i++){
	            a[i] = sc.nextInt();
		        sum += a[i];
		    }
		    if(k == 0)
	        System.out.println((1.0*sum)/n);
            else{
		        Arrays.sort(a);
		        for(int i=0; i<k; i++){
		            sum -= a[i];
		            sum -= a[n-i-1];
		        }
		        System.out.println((1.0*sum)/(n-2*k));
		    }
		}
	}
}

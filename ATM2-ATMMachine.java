/* https://www.codechef.com/problems/ATM2 */
/* ATM Machine */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ATMMachine
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    int[] arr = new int[n];
		    for(int i=0;i<n;i++){
		        arr[i] = sc.nextInt();
		    }
		   for(int i=0;i<n;i++){
		        if(arr[i]<=k)
		        {
		            k = k-arr[i];
		            System.out.print("1");
		        }
		        else{
		            System.out.print("0");
		        }
		   }
		   System.out.println();
		}
	}
}

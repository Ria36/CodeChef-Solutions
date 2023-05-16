/* https://www.codechef.com/problems/NOFIX */
/* Avoid Fixed Points */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class AvoidFixedPoints
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int ts = sc.nextInt();
		for(int t=0;t<ts;t++) {
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    for(int i=0;i<n;i++) 
		    arr[i] = sc.nextInt();
		    int cur = 1;
		    int ans = 0;
		    for(int i=0;i<n;i++,cur++) {
		        if(cur==arr[i]) {
		            ans++;
		            cur++;
		        }
		    }
		    System.out.println(ans);
		}
	}
}

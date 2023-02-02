/* Points and Lines */
/* https://www.codechef.com/LP1TO205/problems/POLIN */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PointsAndLines
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
	   int t = sc.nextInt();
	   while(t-- > 0){
	       int n = sc.nextInt();
	       int[][] arr = new int[n][2];
	       for(int  i = 0; i< n; i++){
	           for(int j = 0 ;j<2;j++){
	               arr[i][j] = sc.nextInt();
	           }
	       }
	       HashSet<Integer> xval = new HashSet<Integer>();
	        HashSet<Integer> yval = new HashSet<Integer>();
	        for(int i = 0 ;i <n ;i ++){
	            xval.add(arr[i][0]);
	            yval.add(arr[i][1]);
	        }
	        System.out.println(xval.size() + yval.size());
	   }
	}
}

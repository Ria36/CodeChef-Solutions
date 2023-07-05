/* https://www.codechef.com/problems/HELPVOLD */
/* Help Voldemort */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class HelpVoldemort
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try{
		Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0; i<n; i++){
		        arr[i] = sc.nextInt();
		    }
		    Arrays.sort(arr);
		    long energy = 0;
		    for(int i=1; i<n; i++){
		        energy = energy + (arr[i-1]*arr[i]);
		      //  sum_of_energy += energy;
		    }
		    System.out.println(energy);
		}catch(Exception e){
		    
		}
	}
}


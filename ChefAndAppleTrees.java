/* https://www.codechef.com/problems/CAPPLE */
/* Chef and Apple Trees */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefAndAppleTrees
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	
	while(t-- > 0){
	    int num = sc.nextInt();
	    
	    int app[] = new int[100001];
	    
	    for(int i = 0 ; i <  num ; i++){
	       int n = sc.nextInt();
	       app[n]++;
	    }
	    
	    int count = 0;
	    for(int i = 1 ; i <= 100000; i++){
	        if(app[i] > 0){
	            count++;
	        }
	    }
	    System.out.println(count);
	}
	}
}


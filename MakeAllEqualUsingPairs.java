/* Make all equal using Pairs */
/* https://www.codechef.com/LP1TO205/problems/PAIREQ */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MakeAllEqualUsingPairs
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0){
		    int n = sc.nextInt();
		    int a[] = new int[n];
		    for(int i=0;i<a.length;i++)
		        a[i] = sc.nextInt();
		        
		        Arrays.sort(a);
		        int count=1;
		        int max=0;
        	        for(int i=0;i<n-1;i++){
                        if(a[i]==a[i+1]) 
                        count++;
                            if(count>max) 
                            max = count;
                                if(a[i]!=a[i+1]) 
                                count=1;
                    }
            System.out.println(n-max);
		    }
		}
	}

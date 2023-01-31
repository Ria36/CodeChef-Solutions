/* Watson asks Does Permutation Exist */
/* https://www.codechef.com/LP1TO205/problems/PERMEXIS */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int a[] = new int[n];
    		    for(int i=0;i<n;i++)
    			a[i]=sc.nextInt();
			boolean flag=true;
			Arrays.sort(a);
    			if(n==1)
    			{
    				System.out.println("YES");
    				continue;
    
    			}
        			if(Math.abs(a[0]-a[1])>1)
        			{
        				System.out.println("NO");
        				continue;
        
        			}
			for(int i=1;i<n-1;i++)
			{
				if(Math.abs(a[i]-a[i-1])>1||Math.abs(a[i]-a[i+1])>1)
				{
					flag=false;
					break;
				}
			}
		if(Math.abs(a[n-1]-a[n-2])>1)
			flag=false;
		
		if(flag)
			System.out.println("YES");
		else
			System.out.println("NO");
	    }
	}
}

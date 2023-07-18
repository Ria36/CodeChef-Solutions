/* https://www.codechef.com/problems/LKDNGOLF */
/* Golf */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Golf
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t>0){
		    --t;
		    int n = scanner.nextInt();
		    int x = scanner.nextInt();
		    int k = scanner.nextInt();
		    if(x%k==0||(n+1-x)%k==0){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}
	}
}



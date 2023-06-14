/* https://www.codechef.com/problems/MAX2 */
/* Max power */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String str=s.next();
        int index=-1;
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='1'){
                index=i;
            }
        }
        System.out.println(n-1-index);
	}
}


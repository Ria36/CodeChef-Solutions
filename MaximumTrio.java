/* Maximum Trio */
/* https://www.codechef.com/LP1TO205/problems/MXMTRIO */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try {
		    
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    long n=sc.nextLong();
		    ArrayList<Long> li=new ArrayList<>();
		    for(int i=0;i<n;i++)
		    {
		        li.add(sc.nextLong());
		    }
		    Collections.sort(li);
		    long ans=((li.get((int)n-1)-li.get((int)0))*li.get((int)n-2));
		    System.out.println(ans);
		}
		} catch(Exception e) {
		} 
	}
}

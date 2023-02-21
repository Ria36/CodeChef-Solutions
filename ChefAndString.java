/* https://www.codechef.com/problems/RECNDSTR */
/* Chef and String */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefAndString
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0)
		{
		    String s = sc.next();
		    String ls = s.substring(1,s.length())+String.valueOf(s.charAt(0));
		    String rs = String.valueOf(s.charAt(s.length()-1))+s.substring(0,s.length()-1);
		    if(ls.equals(rs))
		        System.out.println("YES");
		    else
		        System.out.println("NO");
		}
	}
}


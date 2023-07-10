/* https://www.codechef.com/problems/DISTCODE */
/* Distinct Codes */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class DistinctCodes
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int count = 0;
		    String s = sc.next();
		    Set<String> temp=new TreeSet<>();
		    StringBuilder sub=new StringBuilder("");
		    for(int i=0;i<2;i++){
		        sub.append(s.charAt(i));
		    }
		    temp.add(sub+"");
		    for(int i=1;i<s.length()-2+1;i++){
		        sub.deleteCharAt(0);
		        sub.append(s.charAt(i+2-1));
		        
		        temp.add(sub+"");
		    }
		    System.out.println(temp.size());
		}
	}
}


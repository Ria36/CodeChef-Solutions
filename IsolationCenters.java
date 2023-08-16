/* https://www.codechef.com/problems/CORUS */
/* Isolation Centers */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class IsolationCenters
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(bu.readLine());
		StringBuilder sb=new StringBuilder();
		while(t-->0)
		{
		  String s[]=bu.readLine().split(" ");
		  int n=Integer.parseInt(s[0]),q=Integer.parseInt(s[1]),i,c[]=new int[26];
		  String st=bu.readLine();
		  for(i=0;i<n;i++)
		  c[st.charAt(i)-'a']++;
		  while(q-->0)
		  {
		    int cen=Integer.parseInt(bu.readLine()),v=0;
		    for(i=0;i<26;i++)
		    if(c[i]>cen) v+=c[i]-cen;
		    sb.append(v+"\n");
		  }
		}
		System.out.print(sb);
	}
}

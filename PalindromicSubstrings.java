/* https://www.codechef.com/problems/STRPALIN */
/* Palindromic substrings */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PalindromicSubstrings
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0)
	{
	    String str1=sc.next();
	    String str2=sc.next();
	    HashMap<Character,Integer> hm1=new HashMap<>();
	    HashMap<Character,Integer> hm2=new HashMap<>();
	    for(int i=0;i<str1.length();i++)
	    {
	        char ch=str1.charAt(i);
	        hm1.put(ch,hm1.getOrDefault(ch,0)+1);
	    }
	    for(int i=0;i<str2.length();i++)
	    {
	        char ch2=str2.charAt(i);
	        hm2.put(ch2,hm2.getOrDefault(ch2,0)+1);
	    }
	    int f=0;
	    for(int i=0;i<str1.length();i++)
	    {
	        if(hm2.containsKey(str1.charAt(i)))
	        f=1;
	    }
	    if(f==1)
	    {
	        System.out.println("Yes");
	    }
	    else
	    {
	     System.out.println("No");   
	    }
	}
	}
}

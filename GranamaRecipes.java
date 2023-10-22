/* https://www.codechef.com/problems/GRANAMA * /
/* Granama Recipes */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class GranamaRecipes
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n-->0){
		String s=sc.next();
		String k=sc.next();
		char ch1[]=s.toCharArray();
		char ch2[]=k.toCharArray();
		int c=0;
		int cn=0;
		HashMap<Character,Integer> hs=new HashMap<>();
		 for(int i=0;i<ch1.length;i++) 
	hs.put(ch1[i],hs.getOrDefault(ch1[i],0)+1);
		    
	    	HashMap<Character,Integer> hs2=new HashMap<>();
	    	  for(int i=0;i<ch2.length;i++) 
		hs2.put(ch2[i],hs2.getOrDefault(ch2[i],0)+1);
		if(hs.keySet().equals(hs2.keySet())) c=1;
		    if(hs.equals(hs2)) cn=1;
		    System.out.println(c==cn?"YES":"NO");
	
	}
	}
}


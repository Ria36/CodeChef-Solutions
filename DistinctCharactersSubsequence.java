/* https://www.codechef.com/problems/DISCHAR */
/* Distinct Characters Subsequence */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class DistinctCharactersSubsequence
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine().trim());
		
		while(t-->0){
		    
		    String str = br.readLine().trim();
		    
		    HashSet<Character> set = new HashSet<>();
		    
		    for(char ch : str.toCharArray()){
		        set.add(ch);
		    }
		    
		    System.out.println(set.size());
		}
	}
}

/* https://www.codechef.com/problems/STONES */
/* Jewels and Stones */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class JewelsAndStones
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner inp = new Scanner(System.in);
		int t = inp.nextInt();
		while(t-->0){
		    String j = inp.next();
		    String s = inp.next();
		    int count = 0;
		    for(int i=0; i<s.length(); i++){
		        if(j.contains(s.substring(i, i+1))){
		            count++;
		        }
		    }
		    System.out.println(count);
		}
	}
}

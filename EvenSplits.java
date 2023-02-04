/* Even Splits */
/* https://www.codechef.com/LP1TO205/problems/EVENSPLIT */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class EvenSplits
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    String s = sc.next();
		    
		    if(n<=2){
		        System.out.println(s);
		    }else{
		        char[] ch = s.toCharArray();
		        Arrays.sort(ch);
		        
		        String ans = new String(ch);
		        System.out.println(ans);
		    }
		    
		}
	}
}

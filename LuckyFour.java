/* Lucky Four */
/* https://www.codechef.com/LP1TO205/problems/LUCKFOUR */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class LuckyFour
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    String t = sc.nextLine();
	    
	    for(int i=0; i<Integer.parseInt(t); i++){
	       String n = sc.nextLine();
	        int counter = 0;
	        
	        for(int j=0; j<n.length(); j++){
	            if(n.charAt(j) == '4'){
	                counter++;
	            }
	        }
	        System.out.println(counter);
	    }
	}
}

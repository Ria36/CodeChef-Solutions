/* https://www.codechef.com/problems/RAINFALL1 */
/* Rain in Chefland */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class RainInChefland
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int x = sc.nextInt();
		    if(x<3){
		        System.out.println("LIGHT");
		    }
		    else if(x>=3 && x<7){
		        System.out.println("MODERATE");
		    }
		    else{
		        System.out.println("HEAVY");
		    }
		}
	}
}

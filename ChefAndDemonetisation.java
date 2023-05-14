/* https://www.codechef.com/problems/CHFMOT18 */
/* Chef and Demonetisation */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefAndDemonetisation
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while(T-- > 0){
		    int S= in.nextInt();
		    int N = in.nextInt();
		    
		    int result = 0;
		    if(S%2 == 1) {result++;S--;}
		    while(S>0){
		        result+=(S/N);
		        if(S<N)
			     {
				  result++;
				  break;
			     }
		        S=S%N;
		    }
		    System.out.println(result);  
		}
	}
}

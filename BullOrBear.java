/* https://www.codechef.com/problems/BULLBEAR */
/* Bull or Bear */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class BullOrBear
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int costPrice_X = sc.nextInt();
		    int sellingPrice_Y = sc.nextInt();
		    if(costPrice_X > sellingPrice_Y){
		        System.out.println("LOSS");
		    }
		    else if (costPrice_X == sellingPrice_Y){
		        System.out.println("NEUTRAL");
		    } 
		    else{
		        System.out.println("PROFIT");
		    }
		}
	}
}

/* https://www.codechef.com/problems/EQUALCOIN */
/* Equal Coins */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class EqualCoins
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    if(x%2!=0){
		        System.out.println("NO");
		    }
		    else if(x==0 && (y%2!=0)){
		        System.out.println("NO");
		    }
		    else{
		        System.out.println("YES");
		    }
		}
	}
}

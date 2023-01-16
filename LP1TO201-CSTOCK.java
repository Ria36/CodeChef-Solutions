/* Chef and Stock Prices */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
		    int s = sc.nextInt();
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    float c = sc.nextFloat();
		    float total=0,gainPrice=0;
		    total=s*(c/100);
		    gainPrice = s+total;
		    if(gainPrice>=a && gainPrice<=b)
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

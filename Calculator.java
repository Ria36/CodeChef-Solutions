/* https://www.codechef.com/problems/URCALC */
/* Program Your Own CALCULATOR */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Calculator
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();
            char z = sc.next().charAt(0);
                if(z=='+')
                System.out.println(x+y);
                else if(z=='-')
                System.out.println(x-y);
                else if(z=='*')
                System.out.println(x*y);
                else
                System.out.println((1.0*x)/y);
	}
}

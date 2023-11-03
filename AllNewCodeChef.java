/* https://www.codechef.com/problems/NEWCC */
/* All New CodeChef */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class AllNewCodeChef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
    int x=sc.nextInt(),y=sc.nextInt();
    if(x<y)
    System.out.println("Old");
    else if(x>y)
    System.out.println("New");
    else
    System.out.println("Same");
	}
}

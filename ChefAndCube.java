/* https://www.codechef.com/problems/CHCUBE */
/* Chef and Cube */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChefAndCube
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    String a = sc.next();
		    String b = sc.next();
		    String c = sc.next();
		    String d = sc.next();
		    String e = sc.next();
		    String f = sc.next();
		    if((a.equals(c) || a.equals(d)) && (a.equals(e) || a.equals(f))){
                System.out.println("YES");
            }else if((b.equals(c) || b.equals(d)) && (b.equals(e) || b.equals(f))){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
		}
	}
}


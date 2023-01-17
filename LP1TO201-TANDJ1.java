/* Tom And Jerry 1 */
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
		while(t-->0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    int d = sc.nextInt();
		    int kSteps = sc.nextInt();
		    int dis = Math.abs(c-a) + Math.abs(d-b);
		    if(kSteps==dis)
		    System.out.println("YES");
		    else if(kSteps>dis && (kSteps-dis)%2==0)
		    System.out.println("YES");
		    else 
		    System.out.println("NO");
		}
	}
}

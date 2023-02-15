/* Tekken - Java Solution*/
/* https://www.codechef.com/START77D/problems/TEKKEN */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Tekken
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
		    int healthLevel = b-c;
		    healthLevel = (healthLevel < 0) ? -healthLevel : healthLevel;
		    if(a>healthLevel){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
	}
}

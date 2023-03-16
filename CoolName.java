/* https://www.codechef.com/problems/CALPOWER */
/* Cool Name */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CoolName
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- > 0){
		    String s=sc.next();
		    char[] ca = s.toCharArray();
		    int power=0;
		    Arrays.sort(ca);
		    for(int i=0;i<ca.length;i++){
		        char cc=ca[i];
		        power+=( (i+1) * ((int)cc - 96));
		    }
		    System.out.println(power);
		}
	}
}

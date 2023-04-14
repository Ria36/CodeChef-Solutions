/* https://www.codechef.com/problems/HORSES */
/* Racing Horses */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class RacingHorses
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int s[] = new int[n];
		    for(int i=0;i<n;i++)
		        s[i] = sc.nextInt();
		        Arrays.sort(s);
		        int min = Integer.MAX_VALUE;
		        for(int i=0;i<n-1;i++){
		          min =   Math.min(min,s[i+1]-s[i]);
		        }
		        System.out.println(min);
		    
		}
	}
}

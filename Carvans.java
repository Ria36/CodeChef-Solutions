/* Carvans */
/* https://www.codechef.com/problems/CARVANS */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Carvans
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0) {
            int n= sc.nextInt();
            int max= Integer.MAX_VALUE;
            int count=0;
            while(n-->0){

            int speed= sc.nextInt();
                if(max>=speed){
                    max=speed;
                    count++;
                }
            }
            System.out.println(count);
        }
	}
}

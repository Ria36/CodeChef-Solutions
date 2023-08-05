/* https://www.codechef.com/problems/NITIKA */
/* Whats in the Name */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class WhatsInTheName
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();
        input.nextLine();
        while(testCases-->0){
            String names[] = input.nextLine().trim().split("\\s+");
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<names.length-1; i++){
                sb.append(names[i].toUpperCase().charAt(0)).append(". ");
            }
            sb.append(names[names.length-1].substring(0,1).toUpperCase());
            sb.append(names[names.length-1].substring(1).toLowerCase());
            System.out.println(sb);
        }
	}
}

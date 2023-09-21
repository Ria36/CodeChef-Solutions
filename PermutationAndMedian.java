/* https://www.codechef.com/problems/PER_MED */
/* Permutation And Median */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PermutationAndMedian
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();

        while(test-- >0){
            int n=sc.nextInt();

            int end=n;
            int start=1;

            for(int i=0;i<n;i++){
                if(i%2==0){
                    System.out.print(end+" ");
                    end--;
                }else{
                    System.out.println(start+" ");
                    start++;
                }
            }
        }
	}
}

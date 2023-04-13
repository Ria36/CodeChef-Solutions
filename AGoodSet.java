/* A Good Set */
/* https://www.codechef.com/problems/GOODSET */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class AGoodSet
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for(int t = 0;t<testCases;t++)
        {
            int n = sc.nextInt();
            if(n == 1)
            {
                System.out.println("7");
            }
            else if(n == 2)
            {
                System.out.println("1 2");
            }
            else
            {
                int num = 500;
                for(int i = 1;i<=n;i++)
                {
                    System.out.print(num+" ");
                    num--;
                }
                System.out.println();
            }
        }
	}
}

/* A Big Sale */
/* https://www.codechef.com/problems/BIGSALE */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ABigSale
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--> 0) {
            int N=sc.nextInt();
            double total=0.0d;
            for(int i=0;i<N;i++) {
                double p=sc.nextInt();
                double q=sc.nextInt();
                double d=sc.nextInt();
                double rise = (d*p)/100;
                double newprice = p+rise;
                double dis= (newprice*d)/100;
                double newpriceafterdis = (newprice-dis);
                double loss = (p-newpriceafterdis);
                total = total + (q*loss);
            }
            System.out.println(total);
        }
	}
}

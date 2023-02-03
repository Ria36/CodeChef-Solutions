/* Maximise the Subsequence Sum */
/* https://www.codechef.com/LP1TO205/problems/SIGNFLIP */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MaximiseTheSubsequenceSum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int t=Integer.parseInt(bu.readLine());
        while(t-->0)
        {
            String s[]=bu.readLine().split(" ");
            int n=Integer.parseInt(s[0]),k=Integer.parseInt(s[1]);
            long sum=0;
            PriorityQueue<Integer> pq=new PriorityQueue<>();

            int i,a;
            s=bu.readLine().split(" ");
            for(i=0;i<n;i++)
            {
                a=Integer.parseInt(s[i]);
                if(a<0) pq.add(a);
                else sum+=a;
            }
            while(!pq.isEmpty() && k-->0) sum-=pq.poll();
            sb.append(sum+"\n");
        }
        System.out.print(sb);
	}
}

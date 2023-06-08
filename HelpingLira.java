/* https://www.codechef.com/problems/HELPLIRA */
/* Helping Lira */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class HelpingLira
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int j=1;
        int imax=0;
        int imin=0;
        double ans1 =Integer.MIN_VALUE;//nas1
        double ans2 =Integer.MAX_VALUE;//nas2
        for(int i=1;i<=N;i++){
            int x1=sc.nextInt();
            int y1=sc.nextInt();
            int x2=sc.nextInt();
            int y2=sc.nextInt();
            int x3=sc.nextInt();
            int y3=sc.nextInt();
            double area = Math.abs(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))*0.5;
            if(area >=ans1){
                ans1=area;
                imin=i;
            }if(area <= ans2){
                ans2=area;
                imax=i;
            }
        }
        System.out.println(imax+" "+imin);
	}
}

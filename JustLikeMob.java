/* https://www.codechef.com/problems/MOBKUN */
/* Just Like Mob! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
	    for(int j=0;j<t;j++){
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    int k=sc.nextInt();
		    int x=sc.nextInt();
		    int temp=n*k+m;
		    int temp2=n*(k-1);
		    int temp3=x%temp;
		    if(temp3==0 || temp3-temp2>0){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
	}
	}
}

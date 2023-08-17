/* https://www.codechef.com/problems/CCHEAVEN */
/* Chef in Heaven */

/* package codechef; // don't place package name! */

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
		int T=sc.nextInt();
		while(T-->0){
		    int L=sc.nextInt();
		    String S=sc.next();
		    int ones=0;
		    int zero=0;
		    int flag=0;
		    for(int i=0;i<L;i++){
		        char A=S.charAt(i);
		        if(A=='1') ones++;
		        else zero++;
		        
		        if(ones>=zero){
		            flag=1;
		            break;
		        }
		    }
		    if(flag==1) System.out.println("YES");
		    else System.out.println("NO");
		}
	}
}

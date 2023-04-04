/* https://www.codechef.com/problems/SC31 */
/* Weapon Value */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class WeaponValue
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t > 0)
		{
		    int N=sc.nextInt();
		    String S[]=new String[N];
		    for(int i=0;i<N;i++)
		        S[i]=sc.next();
		    char result[]=S[0].toCharArray();
		    for(int j=1;j<N;j++)
		    {
		        char ch2[]=S[j].toCharArray();
		        for(int i=0;i<10;i++)
		        {
		            if(result[i]==ch2[i])
		             result[i]='0';
		            else
		            result[i]='1';
		        }
		    }
		    int temp=0;
		    for(int i=0;i<10;i++)
		    {
		        if(result[i]=='1')
		        temp++;
		    }
		     System.out.println( temp);
		     t--;
		}
	}
}

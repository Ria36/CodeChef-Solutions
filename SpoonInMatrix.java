/* https://www.codechef.com/problems/SPOON */
/* Spoon in Matrix */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SpoonInMatrix
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
		    boolean flag=false;
		    int r=s.nextInt();
		    int c=s.nextInt();
		    String[] matrix=new String[r];
		    for(int i=0;i<r;i++)
		    {
		        matrix[i]=s.next();
		    }
		    for(int i=0;i<r;i++)
		    {
		        String str=matrix[i];
		        str=str.toLowerCase();
		        if(str.contains("spoon"))
		        {
		           flag=true;
		            break;
		        }
		    }
		    for(int i=0;i<c;i++)
		    {
		        StringBuilder str=new StringBuilder();
		        for(int j=0;j<r;j++)
		        {
		            str.append(matrix[j].charAt(i));
		        }
		        String m=str.toString().toLowerCase();
		        if(m.contains("spoon"))
		        {
		           flag=true;
		            break;
		        }
		    }
		    if(flag==true) System.out.println("There is a spoon!");
		    else System.out.println("There is indeed no spoon!");
		}
	}
}


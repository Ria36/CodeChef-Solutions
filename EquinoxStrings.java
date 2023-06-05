/* https://www.codechef.com/problems/EQUINOX */
/* Equinox Strings */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class EquinoxStrings
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            long sp=0,anp=0;
            String str="EQUINOX";
            for(int i=0;i<n;i++){
                String st=sc.next();
                String res=st.substring(0,1);
                if(str.contains(res))sp+=a;
                else anp+=b;
            }
            if(sp>anp)System.out.println("SARTHAK");
            else if(sp<anp)System.out.println("ANURADHA");
            else System.out.println("DRAW");
        }
	}
}

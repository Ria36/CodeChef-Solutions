/* https://www.codechef.com/problems/POPGATES */
/* At the Gates */

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
		Scanner t = new Scanner(System.in);
        int tt = t.nextInt();
        while(tt-- >0){
          int n = t.nextInt();
          int k = t.nextInt();
          char c[] = new char[n];
          for(int in =0; in<n; in++){
            c[in] = t.next().charAt(0);
          }
          for(int i=n-1; i>=n-k; --i) {
              if(c[i]=='H') {
                  for(int j=0; j<n; ++j) {
                      if(c[j]=='H')
                          c[j]='T';
                      else
                          c[j]='H';
                  }
              }
          }
          int ans=0;
            for(int i=0; i<n-k; ++i)
                if(c[i]=='H')
                    ++ans;
          System.out.println(ans);
          
        }
	}
}


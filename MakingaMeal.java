/* https://www.codechef.com/problems/CFMM */
/* Making a Meal */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MakingaMeal
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int c=0,o=0,d=0,e=0,h=0,f=0;
          for(int in = 0; in <n; in++){
            String S = sc.next();
            for(int i = 0; i<S.length(); i++){
              if(S.charAt(i) == 'c'){
                c++;
              }else if(S.charAt(i) == 'o'){
                o++;
              }else if(S.charAt(i) == 'd'){
                d++;
              }else if(S.charAt(i) == 'e'){
                e++;
              }else if(S.charAt(i) == 'h'){
                h++;
              }else if(S.charAt(i) == 'f'){
                f++;
            	}
            }
          }
          int a[]={c/2,e/2,o,d,h,f};
          Arrays.sort(a);
          System.out.println(a[0]);
          
		}
	}
}

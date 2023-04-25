/* https://www.codechef.com/problems/LADDU */
/* Laddu */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {

            int n = sc.nextInt();
            String str = sc.next();
           
            int l=0;
            for(int j=0;j<n;j++){
                String s= sc.next();
                 int x = 0;
                if(s.equals("CONTEST_WON") || s.equals("BUG_FOUND")){
                    x = sc.nextInt();
                    if(s.equals("CONTEST_WON")){
                        if(x <=20) {
                            l = l + 300 + (20 - x);
                        }
                        else if(x >20){
                            l = l+ 300;
                        }
                    }
                    else if(s.equals("BUG_FOUND")){
                        l = l+x;
                    }
                }
                 else if(s.equals("TOP_CONTRIBUTOR")){
                    l = l + 300;
                }
                else if(s.equals("CONTEST_HOSTED")){
                    l = l+50;
                }
            }
             if(str.equals("INDIAN")){
                System.out.println(l/200);
            }
            else{
                System.out.println(l/400);
            }
        }
	}
}

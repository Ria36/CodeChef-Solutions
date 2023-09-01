/* https://www.codechef.com/problems/LEBOMBS */
/* Little Elephant and Bombs */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class LittleElephantAndBombs
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
		    int n = sc.nextInt();
		    String s = sc.next();
		    boolean[] bool = new boolean[n];
            if(s.charAt(0) == '1'){
                if(s.length()>1) {
                bool[0] = true;
                bool[1] = true;
                } else bool[0] = true;
            }
            if(s.charAt(s.length()-1) == '1'){
                if(s.length()>1){
                bool[bool.length-1] = true;
                bool[bool.length-2] = true;
                } else bool[0] =true;
            }
            for(int i = 1; i<s.length()-1; i++){
                if(s.charAt(i) == '1'){
                    bool[i] = true;
                    bool[i-1] = true;
                    bool[i+1] = true;
                }
            }
            int new_count = 0;
            for(int i=0; i<bool.length; i++){
                if(bool[i] == true){
                    new_count++;
                }
            }
            System.out.println(n-new_count);
		}
	}
}

/* https://www.codechef.com/problems/CLOSEVOWEL */
/* Closest Vowels */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Solution sol = new Solution();
	    sol.output();
	}
}

class Solution {
    private Scanner sc = new Scanner(System.in);
    private static final long modulo = 1000000007;

    void output(){
        int tests=sc.nextInt();
        while (tests-->0){
            int givenLength=sc.nextInt();
            sc.nextLine(); //SKIPPING THE NEWLINE CHARACTER
            String givenWord = sc.next();
            long noOfWays=1L;
            for(int i=0; i<givenLength; i++){
                if(isTheCharacterOneOfCorLorR(givenWord.charAt(i))){
                    noOfWays = (noOfWays*2) % modulo;
                }
            }
            System.out.println(noOfWays);
        }
    }

    private boolean isTheCharacterOneOfCorLorR(char alpha) {
        if(alpha=='c' || alpha=='g' || alpha=='l' || alpha=='r'){
            return true;
        }else{
            return false;
        }
    }
}

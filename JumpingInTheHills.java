/* https://www.codechef.com/problems/HILLS */
/* Jumping in the hills */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class JumpingInTheHills
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++){
            int N = sc.nextInt();
            int U = sc.nextInt();
            int D = sc.nextInt();
            int[] H = new int[N];
            for(int j=0;j<N;j++){
                H[j] = sc.nextInt();
            }
            int count = 0, c=0;
            for(int k=1;k<N;k++){
                if(H[k] >= H[k-1]-D && H[k] <= H[k-1]+U){
                    count=k;
                }
                else if(H[k]<H[k-1]-D && c < 1){
                    count=k;
                    c++;
                }
                else{
                    break;
                }
            }
            System.out.println(count+1);
        }
	}
}

/* https://www.codechef.com/problems/ARREQU */
/* Array Equality */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ArrayEquality
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Map<Integer,Integer>array = new HashMap<Integer,Integer>();
            int n = sc.nextInt();
            int []ar = new int[n];
            for(int i  = 0; i < n; i++){
                ar[i] = sc.nextInt();
                array.put(ar[i],array.getOrDefault(ar[i],0)+1);
            }
            List<Integer>l = new ArrayList(array.keySet());
            Collections.sort(l,((a,b) -> array.get(b) - array.get(a)));
            int x = array.get(l.get(0));
            if(x <= (n+1)/2){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
	}
}

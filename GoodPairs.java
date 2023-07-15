/* https://www.codechef.com/problems/EQPAIR */
/* Good Pairs */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class GoodPairs
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int x = in.nextInt();
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
            long ans = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int x = entry.getValue();
                ans += 1L * x * (x - 1) / 2;
            }
            System.out.println(ans);
        }
	}
}

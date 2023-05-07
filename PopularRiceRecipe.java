/* https://www.codechef.com/problems/TIDRICE */
/* Popular Rice Recipe */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int n, i, sum;
        String[] a;
        Map<String, Integer> map = new HashMap<>();
        while(t-- > 0)
        {
            sum = 0;
            a = br.readLine().split(" ");
            n = Integer.parseInt(a[0]);

            for(i = 0; i < n; i++)
            {
                a = br.readLine().split(" ");
                if(map.containsKey(a[0]))
                {
                    sum = sum - map.get(a[0]);
                }

                if(a[1].equals("+"))
                    map.put(a[0], 1);
                else
                    map.put(a[0], -1);

                sum = sum + map.get(a[0]);
            }

            System.out.println(sum);
            map.clear();
        }
	}
}


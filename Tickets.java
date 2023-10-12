/* https://www.codechef.com/problems/TICKETS5 */
/* Tickets */

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Tickets
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String str = sc.next();
            String[] str1 = str.split("");
            Set<String> st = new LinkedHashSet<String>(Arrays.asList(str1));
            if (st.size() == 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
	}
}

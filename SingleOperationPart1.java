/* https://www.codechef.com/problems/SINGLEOP1 */
/* Single Operation Part 1 */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SingleOperationPart1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sn=new Scanner (System.in);
        int T=sn.nextInt();
        for(int i=0; i<T; i++)
         {
            int k=0;
            int X = sn.nextInt();
            sn.nextLine();  // Consume newline left-over
            String S = sn.nextLine();
            // System.out.println(S);
            for(int j=0; j<S.length(); j++){
                if(S.charAt(j) == '1')
                    k++;
                else
                    break;
            }
            System.out.println(k);
        }
	}
}


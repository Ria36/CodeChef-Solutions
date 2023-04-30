/* https://www.codechef.com/problems/COOMILK */
/* Bear and Milky Cookies */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class BearAndMilkyCookies
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		PrintWriter pt = new PrintWriter(System.out);
		int t = Integer.parseInt(st.nextToken());
		while (t-->0)
		{
		    st = new StringTokenizer(br.readLine());
		    int n = Integer.parseInt(st.nextToken());
		    
		    if(n == 1)
		    {
		        st = new StringTokenizer(br.readLine());
		        if(st.nextToken().equals("milk"))pt.println("YES");
		        else pt.println("NO");
		    }
		    else{
		        
		        String[] arr = new String[n];
		        st = new StringTokenizer(br.readLine());
		        for(int i =0;i<n;i++)
		        {
		            arr[i] = st.nextToken();
		        }
		        boolean f =true;
		        for(int i=0; i<n-1;i++)
		        {
		            if(arr[i].equals("cookie") && arr[i+1].equals("cookie"))
		            {
		                f=false;
		            }
		        }
		        if(arr[n-1].equals("cookie"))pt.println("NO");
		        else if(!f)pt.println("NO");
		        else pt.println("YES");
		    }
    }
		pt.flush();
	}
}

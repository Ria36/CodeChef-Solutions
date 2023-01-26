/* Lazy Salesman */
/* https://www.codechef.com/LP1TO205/problems/HOLIDAYS */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class LazySalesman
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while(test-- > 0){
            int days = scanner.nextInt(),
                rupeesNeeded = scanner.nextInt();
            int workingDaysCount = 0, sum = 0;
            int[] dailyEarnings = new int[days];
            for(int i = 0; i < days; i++){
                dailyEarnings[i] = scanner.nextInt();
            }
            Arrays.sort(dailyEarnings);
            for(int i = days - 1; i >= 0; i--){
                workingDaysCount++;
                sum += dailyEarnings[i];
                if(sum >= rupeesNeeded){
                    break;
                }
            }
            int maxHolidays = days - workingDaysCount;
            System.out.println(maxHolidays);
        }
        scanner.close();
	}
}

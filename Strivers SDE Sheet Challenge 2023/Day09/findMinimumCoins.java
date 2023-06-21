import java.util.* ;
import java.io.*; 
public class Solution
{
public static int findMinimumCoins(int amount)
    {
        // Write your code here.
        int coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
        int ans = 0;
        for(int i=coins.length-1; i>=0; i--){
            int count = 0;
            while( amount >= coins[i]){
                amount -= coins[i];
                count++;
            }
            ans += count;
        }

        return ans;

    }
}

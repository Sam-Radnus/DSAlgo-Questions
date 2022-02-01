import java.util.*;
public class RichestCustomerWealth {
    public static int maximumWealth(int[][]accounts) {
        int maxWealth = 0;
        int rows = accounts.length;
        int columns = accounts[0].length;
        for (int i = 0; i < rows; i++) {
            int sum=0;
            System.out.println();
            for (int j = 0; j < columns; j++) {

                sum+=accounts[i][j];
            }

            maxWealth=Math.max(maxWealth,sum);
        }
        return maxWealth;
    }
    public static void main(String args[])
    {
        int accounts[][]={{1,5},{7,3},{3,5}};
        System.out.println(maximumWealth(accounts));
    }
}

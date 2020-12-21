import java.util.Scanner;

public class Coin_Exchange_NoOfWays {

    public static int count(int[] d, int amount) {

        int[][] V = new int[amount + 1][d.length + 1];

        /* Write down the base solution*/
        /* Fill in the rest of the matrix using recursion relation */
        for (int j = 0; j <= d.length; j++) {
            V[0][j] = 1;
        }


        // Evaluating 2D array for getting Maximum Number of Ways
        for (int j = 1; j <= d.length; j++) {
            for (int i = 1; i <= amount; i++) {
                if (d[j-1] > i) {
                    V[i][j] = V[i][j-1];
                }
                else {
                    V[i][j] = V[i-d[j-1]][j] + V[i][j-1];
                }
            }
        }

        // Printing the 2D Array
        for (int i=0; i<=amount; i++) {
            for (int j=0; j<=d.length; j++) {
                System.out.print(V[i][j] + " ");
            }
            System.out.println();
        }

        return V[amount][d.length];
    }

    public static void main(String args[]) {
        int[] d = {1,5,7,10};
        Scanner scan = new Scanner(System.in);
        int amount = scan.nextInt();
        System.out.println(count(d, amount));
        scan.close();
    }
}

package SolveAnySquareOrHollowPattern;

import java.util.Scanner;

public class HollowIncreasingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = scanner.nextInt();

        // Last Row: i = n
        // Starting & Ending of each row
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= n; cols++) {
                if (rows == n || cols == 1 || cols == rows) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

package SolveAnySquareOrHollowPattern;

import java.util.Scanner;

public class HollowDecreasingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = scanner.nextInt();

        // Top Row: i = n
        // First and Last star of each row
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = rows; cols <= n; cols++) {
                if (rows == 1 || cols == rows || cols == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

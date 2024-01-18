package SolveAnyAquareOrHollowPattern;

import java.util.Scanner;

public class SquarePlusPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = scanner.nextInt();

        // Mid Row: n / 2 + 1
        // Mid Column: n / 2 + 1
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= n; cols++) {
                if (rows == n / 2 + 1 || cols == n / 2 + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

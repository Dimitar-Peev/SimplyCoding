package SolveAnySquareOrHollowPattern;

import java.util.Scanner;

public class HollowHillPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = scanner.nextInt();

        // Hill Pattern
        // 2: Last Row: i=n, Starting star: j=1
        // 3: Last Row: i=n, Ending star: j=n
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            for (int cols = 1; cols < i; cols++) {
                if (i == n || cols == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int cols = 1; cols <= i; cols++) {
                if (i == n || cols == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}

package SolveAnySquareOrHollowPattern;

import java.util.Scanner;

public class SquareParallelBarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = scanner.nextInt();

        // First Column: cols = 1
        // Last Column: cols = n
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= n; cols++) {
                if (cols == 1 || cols == n) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

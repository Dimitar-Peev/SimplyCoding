package SolveAnyAquareOrHollowPattern;

import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = scanner.nextInt();

        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= n; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

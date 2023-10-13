package com.main;
import java.util.Scanner;

public class PatternGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();

        System.out.print("Enter '1' for ascending, '2' for descending: ");
        int order = scanner.nextInt();

        System.out.print("Enter '1' to mirror the pattern, '0' otherwise: ");
        int mirror = scanner.nextInt();

        generatePattern(numRows, order, mirror);

        scanner.close();
    }

    public static void generatePattern(int numRows, int order, int mirror) {
        for (int i = 1; i <= numRows; i++) {
            int startNum = (order == 1) ? 1 : numRows - i + 1;
            int endNum = (order == 1) ? i : numRows;

            for (int j = startNum; j <= endNum; j++) {
                System.out.print(j + " ");
            }

            if (mirror == 1) {
                for (int j = endNum - 1; j >= startNum; j--) {
                    System.out.print(j + " ");
                }
            }

            System.out.println();
        }
    }
}

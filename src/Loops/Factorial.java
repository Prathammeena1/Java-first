package Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double factorial = 1;
        for (int i = 1; i <= n ; i++) {
            factorial *= i;
        }
        System.out.println("The factorial for "+ n+ " is " + factorial);
    }
}

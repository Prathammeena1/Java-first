package Conditionals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // even or odd number
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("The number is even.");
        }
        else {
            System.out.println("The number is odd.");

        }
    }
}

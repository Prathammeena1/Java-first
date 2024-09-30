package MathQuestions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount : ");
        double principal = sc.nextDouble();
        System.out.println("Enter the rate of interest in percentage (Don't write percentage) : ");
        double rate = sc.nextDouble();
        System.out.println("Enter the number of times interest is compounded per year : ");
        double n = sc.nextInt();
        System.out.println("Enter the time (In years) ");
        double t = sc.nextDouble();
        double Amount = principal * Math.pow((1 + rate / n), n * t);
        double compoundInterest = Amount - principal;
        System.out.println("The total amount is : " + Amount);
        System.out.println("The compound interest is : " + compoundInterest);

    }
}

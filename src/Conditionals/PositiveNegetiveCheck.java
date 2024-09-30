package Conditionals;

import java.util.Scanner;

public class PositiveNegetiveCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num > 0){
            System.out.println("It is a positive number.");
        } else if (num < 0) {
            System.out.println("It is a negetive number.");
        }
        else {
            System.out.println("It is a 0.");
        }
    }
}

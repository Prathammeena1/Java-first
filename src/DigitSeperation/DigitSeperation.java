package DigitSeperation;

public class DigitSeperation {
    public static void main(String[] args) {
        int n = 12345;
        while(n != 0){
            System.out.println(n%10);
            n/=10;
        }
    }
}

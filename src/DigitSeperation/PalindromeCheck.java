package DigitSeperation;

public class PalindromeCheck {
    public static void main(String[] args) {
        int n = 12321;
        int nCopy = n;
        int rev = 0;
        while(nCopy != 0){
            rev = rev *10 + nCopy%10;
            nCopy/=10;
        }
        System.out.println(n == rev ? "Palindrome" : "Not Palindrome");
    }
}

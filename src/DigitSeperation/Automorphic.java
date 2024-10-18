package DigitSeperation;

public class Automorphic {
    public static void main(String[] args) {
        int n = 6;
        int temp = n;
        int count = 0;
        while(n!=0){
            count++;
            n/=10;
        }
        n= temp;
        long sq = n*n;
        long lastDigits = sq % (int)(Math.pow(10,count));
        System.out.println(lastDigits == n ?"Automorphic" : "Not automorphic");
    }
}

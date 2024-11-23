package Loops;

public class Power {
    public static void main(String[] args) {
        int a= 2 , b =4;
        long res = 1;
        for(int i = 1 ; i<= b ; i++){
            res*=a;
        }
        System.out.println(res);
    }
}

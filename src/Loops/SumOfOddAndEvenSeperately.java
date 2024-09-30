package Loops;

public class SumOfOddAndEvenSeperately {
    public static void main(String[] args) {
        int n = 4;
        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 1; i <= n;i++){
            if(i%2 == 0 ){
                sumEven += i;
            }
            else{
                sumOdd += i;
            }
        }

        System.out.println(STR."sum of odd are \{sumOdd}, sum of even are \{sumEven}");
    }
}

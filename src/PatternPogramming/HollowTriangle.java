package PatternPogramming;

public class HollowTriangle {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i<= n;i++){
            for (int j = 1; j<= n-i;j++){
                System.out.print("  ");
            }
            for (int j = 1;j<i+1;j++){
                if(i==n || j== i || j==1){
                System.out.print("* ");
                }else {
                System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}

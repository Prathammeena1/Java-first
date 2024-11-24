package Strings;

public class Toggling {
    public static void main(String[] args) {
        String s = "PraThaMmeEnA";
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch>='A' && ch<= 'Z'){
                ans = ans + (char) (ch+32);
            }else {
                ans = ans + (char) (ch-32);
            }
        }
        System.out.println(ans);
    }
}

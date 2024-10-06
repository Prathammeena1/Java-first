package SwitchCase;

public class Week {
    public static void main(String[] args) {
        int day = 6;
        switch (day){
            case 1 -> {
                System.out.println("Mon");
            }case 2 -> {
                System.out.println("Tues");
            }case 3 -> {
                System.out.println("Wed");
            }case 4 -> {
                System.out.println("Thur");
            }case 5 -> {
                System.out.println("Fri");
            }case 6 -> {
                System.out.println("Sat");
            }case 7 -> {
                System.out.println("Sun");
            }
            default -> {
                System.out.println("No");
            }
        }
    }
}

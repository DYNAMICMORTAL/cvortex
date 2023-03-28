import java.util.*;
public class switchGreeting {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = num.nextInt();
        switch(a) {
            case 1:
                System.out.println("heya");
                break;
            case 2:
                System.out.println("bitch");
                break;

            default:
                System.out.println("nevermind me");
        }
    }
}
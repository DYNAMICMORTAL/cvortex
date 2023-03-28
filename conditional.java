import java.util.*;
public class conditional {
    public static void main(String args[]) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = num.nextInt();
        if (age < 18) {
            System.out.println("You are a Kid!!!\n");
        } else if (age == 18) {
            System.out.println("Perfect Age to become an Adult");
        } else {
            System.out.println("Yeahhhh!!!!");
        }
    }
}
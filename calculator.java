import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int sum,mul, div, mod, sub;
        System.out.println("Welcome to Mini-Calulator!");
        System.out.println("Operations available are +(1) *(2) /(3) -(4) %(5)");
        System.out.println("Enter the Character");
        int a = num.nextInt();
        switch(a) {
            case 1:
                System.out.println("Enter the first number: ");
                int num1 = num.nextInt();
                System.out.println("Enter the second number: ");
                int num2 = num.nextInt();
                System.out.println(num1+num2);
                break;
            case 2:
                System.out.println("Enter the first number: ");
                int num3 = num.nextInt();
                System.out.println("Enter the second number: ");
                int num4 = num.nextInt();
                System.out.println(num3*num4);
                break;
            case 3:
                System.out.println("Enter the first number: ");
                int num5 = num.nextInt();
                System.out.println("Enter the second number: ");
                int num6 = num.nextInt();
                System.out.println(num5/num6);
                break;
            case 4:
                System.out.println("Enter the first number: ");
                int num9 = num.nextInt();
                System.out.println("Enter the second number: ");
                int num10 = num.nextInt();
                System.out.println(num9-num10);
                break;
            case 5:
                System.out.println("Enter the first number: ");
                int num7 = num.nextInt();
                System.out.println("Enter the second number: ");
                int num8 = num.nextInt();
                System.out.println(num7%num8);
                break;
            default:
                System.out.println("invalid character!");
        }
    }
}
import java.util.*;
public class switchCalci {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int flag;
        System.out.println("Enter the number to perform Ops: \n");
        int a = num.nextInt();
        switch(a) {
            case 1:
                System.out.println("Enter two numbers to add: \n");
                int a1 = num.nextInt();
                int a2 = num.nextInt();
                System.out.print(a1+a2);
                flag = 1;
                break;
            case 2:
                System.out.println("Enter two numbers to sub: \n");
                int a3 = num.nextInt();
                int a4 = num.nextInt();
                System.out.print(a3-a4);
                flag = 1;
                break;
            case 3:
                System.out.println("Enter two numbers to mul: \n");
                int a5 = num.nextInt();
                int a6 = num.nextInt();
                System.out.print(a5*a6);
                flag = 1;
                break;
            case 4:
                System.out.println("Enter two numbers to divide: \n");
                int a7 = num.nextInt();
                int a8 = num.nextInt();
                System.out.print(a7/a8);flag = 1;
                break;
            case 5:
                System.out.println("Enter two numbers to get Modulo: \n");
                int a9 = num.nextInt();
                int a10 = num.nextInt();
                System.out.print(a9/a10);
                flag = 1;
                break;
            default:
                System.out.println("Invalid Character Range!! \n");
                flag = 0;
                break;
        }
        if(flag == 1){
            System.out.println("Thank You for using our Calucalator!! \n");
        } else {
            System.out.println("Please enter the number from range 1 - 5! \n");
        }
    }
}
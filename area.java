import java.util.*;
public class area {
    public static void main(String args[]) {
        int a=10, b=15, sum=0, sub, div, mul;
        float r = 10.2F, circus;
        sum=a+b;
        mul=a*b;
        div=a/b;
        sub=b-a;
        circus= (float) (2*3.14*r);
        System.out.println(circus);
        // How to take input from User and print it
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
    }
}
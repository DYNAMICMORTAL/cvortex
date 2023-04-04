import java.util.*;
public class recursion1 {
    public static void printNumbers(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printNumbers(n-1);
    }
    public static void printNumbers2(int m){
        if(m == 6){
            return;
        }
        System.out.println(m);
        printNumbers2(m+1);
    }

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int m = 1;
        printNumbers(n);
        printNumbers2(m);
    }
}

import java.util.*;
public class nNatualNos {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int sum=0;
        int n = num.nextInt();
        for (int i=0;i<=n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
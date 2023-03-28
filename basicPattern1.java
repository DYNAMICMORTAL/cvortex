// Solid Rectangle Pattern Placement Java
import java.util.*;
public class basicPattern1 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        int n = 5;
        for(int i=0; i<a; i++) {
            for(int j=0; j < n; j++) {
                System.out.print("*");
            }
        }
    }
}
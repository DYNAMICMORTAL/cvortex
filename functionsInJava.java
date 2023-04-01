import java.util.*;
public class functionsInJava{
    public static void myName(String name){
        System.out.println(name);
        return;
    }
    public static void main (String[] args){
        Scanner num = new Scanner(System.in);
        String name = num.next();
        myName(name);
    }
}
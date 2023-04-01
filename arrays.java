public class arrays {
    public static void main(String[] args) {
        int[] num = new int[5];
        char[] num1 = new char[4];
        num[0] = 97;
        num[1] = 95;
        num[2] = 90;
        num[3] = num[1]+num[2];
        System.out.println(num[2]);
        System.out.println(num[3]);
        System.out.println(num[0]+num[2]);

        num1[1] = 'c';
        System.out.println(num1[1]);
    }
}
public class StringBuilderType {
    public static void main(String[] args) {
        StringBuilder sc = new StringBuilder("Heya!");
        System.out.println(sc);
        sc.setCharAt(0, 'P');
        System.out.println(sc);
        sc.insert(0, 'H');
        System.out.println(sc);
        sc.deleteCharAt(0);
        System.out.println(sc);

        // practice
        String a = "42";
        int b = Integer.parseInt(a);
        System.out.println(b);
        a += '1';
        System.out.println(a);

    }
}
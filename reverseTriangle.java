public class reverseTriangle {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i<=n; i++){
            for(int j = 1; j<=i;j++){
                for(int x = 4; x<=1; x--) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
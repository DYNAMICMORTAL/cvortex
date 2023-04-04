public class backtracking1 {
    public static void permutation(String sc, String perm, int idx){
        if(sc.length() == 0){
            System.out.println(perm);
            return;
        }
        for(int i = 0; i<sc.length(); i++){
            char currChar = sc.charAt(i);
            String newChar =sc.substring(0, i) + sc.substring(i+1);
            permutation(newChar, perm + currChar, idx+1);
        }
    }
    public static void main(String[] args){
        String sc = "ABC";
        permutation(sc, "", 0);
    }
}
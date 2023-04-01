public class strings{
    public static void main(String[] args) {
        String firstname = "Janhavi";
        String lastname = "Kasar";
        String fullName = firstname + " " + lastname;
        System.out.println(fullName);
        System.out.println(fullName.length());

        for(int i = 0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i)); // print single letters on the screen using .chartAt()
        }
        if(firstname.compareTo(lastname) == 0) { // compare the 2 strings to find out bigger smaller and equal to Strings.
            System.out.println("Strings are equal!");
        } else {
            System.out.println("Strings are not equal!");
        }
        String about = "I live in Thane and my college is APSIT";
        String shortabout = about.substring(20, about.length()); // only print the small custom part of a String!
        System.out.println(shortabout);
    }
}
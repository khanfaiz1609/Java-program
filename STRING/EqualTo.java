package STRING;

public class EqualTo {
    public static void main(String[] args) {
        String s1="khan";
        String s2="KHAN";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s2.substring(0));
        System.out.println(s1.toString());
    }
}
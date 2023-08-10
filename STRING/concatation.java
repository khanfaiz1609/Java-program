package STRING;

public class concatation {
    public static void main(String[] args) {
        String s1="faiz";
        String s2="java";

        System.out.println(s1+s2);
        System.out.println(s1+10);
        System.out.println(s1+10+20);
        System.out.println(10+20+s1);
        System.out.println(10+s2+20);
        System.out.println(s2+20/10);
        System.out.println(s1.concat(s2));
        System.out.println(String.join(",",s2,s1));
    }
}

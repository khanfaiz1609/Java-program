package STRING;

public class StringConversion {
    public static void main(String[] args) {
        String name="khAnfaiz";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        //---------------------------------------
        int a=10, b=20;
        System.out.println(a+b);
        String s1 = String.valueOf(a);
        String s2 = String.valueOf(b);
        System.out.println(s1+s2);
        char[] c= name.toCharArray();
        System.out.println(c);


    }
}

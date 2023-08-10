package STRING;

public class StringBufferDemo {
    public static void main(String[] args) {

        StringBuffer sb =new StringBuffer();

        System.out.println(sb.capacity());
        sb.append("hello");
        System.out.println(sb.capacity());
        sb.append("khan faiz kh");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

    }
}

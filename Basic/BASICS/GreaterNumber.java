package Basic;

public class GreaterNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        if (a>b && a>c){
            System.out.println("a is greater than a&b");
        }
        else if (b>a && b>c) {
            System.out.println("b is greater than a&c");
        }
        else {
            System.out.println("c is greater than a&c");
        }
    }
}

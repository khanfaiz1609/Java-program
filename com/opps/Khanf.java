package OOPS;

public class Khanf{
    void khan() {
        System.out.println("employee");
    }
}
    class Kaif extends Khanf{
        void siddique(){
            System.out.println("chapri");
        }
    }
    class farman extends Kaif{
    void qureshi(){
        System.out.println("Kasai");
    }

        public void khan2() {

        }
    }
    class Testinheritence{
    public static void main(String[] args){
        farman f = new farman();
        f.qureshi();
        f.siddique();
        f.khan2();
    }
    }


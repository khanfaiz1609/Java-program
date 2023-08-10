class Person {
    public Person() {
        System.out.println("Super class 1st constructor");

    }

    public Person(String name) {
        System.out.println("super class 2nd constructor");
    }
}
   public class ConstructorShow extends Person {
         public ConstructorShow(){
            this("A");
            System.out.println("subclass 1st constructor");
        }
        public ConstructorShow(String name){
            super();
            System.out.println("subclass 2nd constructor");
        }

       public static void main(String[] args) {
           ConstructorShow ob = new ConstructorShow();
       }
    }



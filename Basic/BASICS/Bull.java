package Basic;

 class Bull {
     public static void main(String[] args) {
         int a = 10;
         int b = 20;

         boolean b1 = true;
         boolean b2 = false;
         boolean b3 =(b1==b2);

         System.out.println(b1);
         System.out.println(b2);
         System.out.println(b3);
         if (a<b){
             System.out.println(b2);
         }
         else {
             System.out.println(b3);
         }
     }
 }
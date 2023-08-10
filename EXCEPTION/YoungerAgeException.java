package EXCEPTION;

import java.util.Scanner;
public class YoungerAgeException extends RuntimeException{
   
	private static final long serialVersionUID = 1L;

	YoungerAgeException(String msg){
        super(msg);
    }
}
class voting{
    public static void main(String[] args) {
     try (Scanner s = new Scanner(System.in)) {
		System.out.println("Enter your age; ");
        int age = s.nextInt();
        try {
            if (age <18) {
                throw new YoungerAgeException("You are not eligible to voting");
            } else {
                System.out.println("You can vote successfully");
            }
        }
            catch(YoungerAgeException e){
                e.printStackTrace();
            }
	}
    }
}

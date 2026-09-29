
import java.util.Scanner;
class ExceptionLineTooLong extends RuntimeException{

	private String message;
	
	public ExceptionLineTooLong(String message){
		this.message =message;
	}
    
	public String getMessage() {
		return message;
	}
	
}
class StringCalculator{
	private String string;
	
	private static Scanner in = new Scanner(System.in);
	
	StringCalculator(){
		
	}
	
	public void acceptString() {
		
	     System.out.println("Enter The String");
	     string = in.nextLine();
	     if(string.length()>80) {
	    	 throw new ExceptionLineTooLong("String is Too Long");
	     }
	     
	}
	
	public void printString() {
		System.out.println("Given String :"+ string);
	}
}
public class Calcula {
      public static void main(String[] args) {
    	  StringCalculator strcal = new StringCalculator();
        try {
    	  strcal.acceptString();
        }catch(ExceptionLineTooLong ex) {
        	ex.getMessage();
        	ex.printStackTrace();
        }
          strcal.printString();
      }
}

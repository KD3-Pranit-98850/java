import java.util.Scanner;

public class Assignment_1_1 {

	public static void main(String[] args) {
		
		Integer a;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		
		a = in.nextInt();
		
		String bin = Integer.toBinaryString(a);
		
		System.out.println("Binary: " + bin );
		
		String oct = Integer.toOctalString(a);
		
		System.out.println("Octal: " + oct);
		
		String hex = Integer.toHexString(a);
		
		System.out.println("Hexal: " + hex );
		
		
	
		
		
		
	}

}

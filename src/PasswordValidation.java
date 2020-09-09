import java.util.*;

public class PasswordValidation {//main class, no inner classes

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); //open a new scanner for user input
		String password = ""; //initialized to empty string, awaiting user input
		boolean hasUpper; //initialized in the doWhile loop, was not sure if this evaluated upon initialization and password needs to wait for user input
		boolean hasLower;
		int exclaim;//left side of condition in the if statement needs to be a variable
		char x ='!';
		boolean retry = true;//retries make it easier to test each condition
		
		do{		
		System.out.println("Please enter a password 7-12 character password containing at least one uppercase letter, one lowercase letter, and an exclamation point.");
		System.out.print("Password: ");
		password = scn.next();//returns the next complete token(user input) ***note, this does not read a carriage return as an input, blank entries will continue to await input
		exclaim = password.indexOf(x);//returns the location of char x, or -1 if x is not found
		hasLower = !password.equals(password.toUpperCase());
		hasUpper = !password.equals(password.toLowerCase());

			if (exclaim >= 0) {
				if (password.length() >= 7 && password.length() <= 12) {//password length validation
					if (hasUpper && hasLower) {//case requirements validation
						System.out.println("Password valid and accepted");
						retry = false;
					} else {
						System.out.println("Error");
						System.out.println("\r\n" + "\r\n");
						retry = true;
					}
				} else {
					System.out.println("Error");
					System.out.println("\r\n" + "\r\n");
					retry = true;
				}
			} else {
				System.out.println("Error");
				System.out.println("\r\n" + "\r\n");
				retry = true;
			}
		} while(retry);
		scn.close();//closes scanner once input is valid.
	}

}

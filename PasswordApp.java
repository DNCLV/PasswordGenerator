
public class PasswordApp {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the password generator. You will be asked questions to determine how you want your password to be generated");
		Password pw1 = new Password();
		System.out.println("Your newly generated password is: " + pw1.shuffle());
		
		// Make sure that the right amount of characters will be appended to the password ( / % ) The program cannot calculate the remainder in the password (example: passwordlength 13, 4 true conditions)
		// try catch methods to catch wrong console input - I cannot figure out how to use try catch method for the scanner, without sacrificing my return value, which is used later on in the code.
	}

}

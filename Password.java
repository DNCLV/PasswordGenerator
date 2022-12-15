import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class Password {

	StringBuilder sb = new StringBuilder();
	int passwordLength = getLength();
	boolean isUppercase = false;
	boolean isLowercase = true;
	boolean isNumber = false;
	boolean isSymbol = false;
	String generator;
	String uppercasePart;
	String lowercasePart;
	String numberPart;
	String symbolPart;
	String shuffle;
	String lowercasePart1;
	String spassword = uppercasePart + lowercasePart + numberPart + symbolPart;
	int remainder;
	String appendRemainder;
	int isTrue;
	char[] password = new char[passwordLength];
	
	public Password() {
		
		this.isUppercase = isUppercase();
		//this.isLowercase = isLowercase();
		this.isNumber = isNumber();
		this.isSymbol = isSymbol();
		this.isTrue = upperTrue() + lowerTrue() + numberTrue() + symbolTrue();
		this.uppercasePart = appendUppercase(passwordLength/isTrue);
		this.lowercasePart = appendLowercase(passwordLength/isTrue);
		this.numberPart = appendNumber(passwordLength/isTrue);
		this.symbolPart = appendSymbol(passwordLength/isTrue);
		this.remainder = remainder();
		this.appendRemainder = appendRemainder(passwordLength%isTrue);
		this.generator = generator();
	}
	
	// Method to decide password length
	
	public int getLength() {
		Scanner in = new Scanner(System.in);
		System.out.print("Please declare your desired password length. The password must have a minimum length of 8: ");
		try {
			int pwLength = in.nextInt();
			if (pwLength >= 8) {
			return pwLength;
			} else {
				System.out.println("Your password must be a minimum of 8 characters. Please input a valid number");
				return getLength();
			}
		} catch(InputMismatchException e) {
			System.out.println("Be so kind to only use positive numerals");
			return getLength();
		}
	}
	
	// Method to determine if uppercase is wanted in the password
	public boolean isUppercase() throws NoSuchElementException{
		Scanner in = new Scanner(System.in);
		System.out.print("Do you want uppercase letters in your password? Y/N: ");
		char answer = in.next().toUpperCase().charAt(0);
			if (answer == 'Y') {
			return isUppercase = true;
			} else if (answer == 'N') {
			return isUppercase = false;
			} else {
				System.out.println("Be so kind to only enter 'Y' for Yes and 'N' for No");
				return isUppercase();
			}
		
	}
	
	// Method to determine if numbers is wanted in the password
	public boolean isNumber() throws NoSuchElementException{
		Scanner in = new Scanner(System.in);
		System.out.print("Do you want numbers in your password? Y/N: ");
		char answer = in.next().toUpperCase().charAt(0);
			if (answer == 'Y') {
			return isNumber = true;
			} else if (answer == 'N') {
			return isNumber = false;
			} else {
				System.out.println("Be so kind to only enter 'Y' for Yes and 'N' for No");
				return isNumber();
			}
		
	}
	// Method to determine if symbols is wanted in the password
	public boolean isSymbol() throws NoSuchElementException{
		Scanner in = new Scanner(System.in);
		System.out.print("Do you want symbols in your password? Y/N: ");
		char answer = in.next().toUpperCase().charAt(0);
			if (answer == 'Y') {
			return isSymbol = true;
			} else if (answer == 'N') {
			return isSymbol = false;
			} else {
				System.out.println("Be so kind to only enter 'Y' for Yes and 'N' for No");
				return isSymbol();
			}
		
	}
	
	// Method to generate password
	public String generator() {
		if (isUppercase) sb.append(uppercasePart);
		if (isLowercase) sb.append(lowercasePart);
		if (isNumber) sb.append(numberPart);
		if (isSymbol) sb.append(symbolPart);
		if (isLowercase) sb.append(appendRemainder);
		return sb.toString();
		}
	
		// Methods to count boolean true values
		public int upperTrue() {
			int trueCount = 0;
			if (isUppercase == true) {
				trueCount++;
			} return trueCount;
		} 
		
		public int lowerTrue() {
			int trueCount = 0;
			if (isLowercase == true) {
				trueCount++;
			} return trueCount;
		} 
		public int numberTrue() {
			int trueCount = 0;
			if (isNumber == true) {
				trueCount++;
			} return trueCount;
		} 
		public int symbolTrue() {
			int trueCount = 0;
			if (isSymbol == true) {
				trueCount++;
			} return trueCount;
		} 
		
		// Method for StringBuilder to append the necessary part from ASCII
		public String appendUppercase(int n) {
			String UPPERCASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < n; i++) {
				int index = (int)(UPPERCASE_LETTERS.length()*Math.random());
				sb.append(UPPERCASE_LETTERS.charAt(index));
			} return sb.toString();
		} 
		public String appendLowercase(int n) {
			String LOWERCASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < n; i++) {
				int index = (int)(LOWERCASE_LETTERS.length()*Math.random());
				sb.append(LOWERCASE_LETTERS.charAt(index));
			} return sb.toString();
		} 
		public String appendNumber(int n) {
			String NUMBERS = "1234567890";
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < n; i++) {
				int index = (int)(NUMBERS.length()*Math.random());
				sb.append(NUMBERS.charAt(index));
			} return sb.toString();
		} 
		public String appendSymbol(int n) {
			String SYMBOLS = "!@#$%^&*()-_=+\\/~?";
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < n; i++) {
				int index = (int)(SYMBOLS.length()*Math.random());
				sb.append(SYMBOLS.charAt(index));
			} return sb.toString();
		} 
		
		// Method to calculate remainder when password is divided
		public int remainder() {
			int remainder = passwordLength%isTrue;
			if (passwordLength/isTrue > 0);
			return remainder;
		}  
		
		// Method to append remainder
		public String appendRemainder(int n) {
			String LOWERCASE_LETTERS = "abcdefghijklmnopqrstuvwxyz";
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < n; i++) {
				int index = (int)(LOWERCASE_LETTERS.length()*Math.random());
				sb.append(LOWERCASE_LETTERS.charAt(index));
			} return sb.toString();
		} 
		
		// Method to shuffle the password
		
		 public String shuffle(){
		        List<Character> characters = new ArrayList<Character>();
		        for(char c:generator.toCharArray()){
		            characters.add(c);
		        }
		        StringBuilder output = new StringBuilder(passwordLength);
		        while(characters.size()!=0){
		            int randPicker = (int)(Math.random()*characters.size());
		            output.append(characters.remove(randPicker));
		        }
		        return output.toString();
		
		 }	
		 
}
		
	
		
	

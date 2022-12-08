import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Password {

	StringBuilder sb = new StringBuilder();
	int passwordLength;
	boolean isUppercase = false;
	boolean isLowercase = false;
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
	int isTrue;
	
	public Password() {
		
		this.passwordLength = PasswordLength();
		this.isUppercase = isUppercase();
		this.isLowercase = isLowercase();
		this.isNumber = isNumber();
		this.isSymbol = isSymbol();
		this.isTrue = upperTrue() + lowerTrue() + numberTrue() + symbolTrue();
		this.uppercasePart = appendUppercase(passwordLength/isTrue);
		this.lowercasePart = appendLowercase(passwordLength/isTrue);
		this.numberPart = appendNumber(passwordLength/isTrue);
		this.symbolPart = appendSymbol(passwordLength/isTrue);
		this.generator = generator();
	}
	
	// Method to decide password length
	
	public int PasswordLength() {
		Scanner in = new Scanner(System.in);
		System.out.print("Please declare your desired password length: ");
		int pwLength = in.nextInt();
		return pwLength;
	}
	
	// Method to determine if uppercase is wanted in the password
	public boolean isUppercase() {
		Scanner in = new Scanner(System.in);
		System.out.print("Do you want uppercase letters in your password? Y/N: ");
		char answer = in.next().toUpperCase().charAt(0);
		if (answer == 'Y') {
			return isUppercase = true;
		} else {
			return isUppercase = false;
		}
		
	}
	
	// Method to determine if lowercase is wanted in the password
	public boolean isLowercase() {
		Scanner in = new Scanner(System.in);
		System.out.print("Do you want lowercase letters in your password? Y/N: ");
		char answer = in.next().toUpperCase().charAt(0);
		if (answer == 'Y') {
			return isLowercase = true;
		} else {
			return isLowercase = false;
		}
	}
	
	// Method to determine if numbers is wanted in the password
	public boolean isNumber() {
		Scanner in = new Scanner(System.in);
		System.out.print("Do you want numbers in your password? Y/N: ");
		char answer = in.next().toUpperCase().charAt(0);
		if (answer == 'Y') {
			return isNumber = true;
		} else {
			return isNumber = false;
		}
	}
	
	// Method to determine if symbols is wanted in the password
	public boolean isSymbol() {
		Scanner in = new Scanner(System.in);
		System.out.print("Do you want symbols in your password? Y/N: ");
		char answer = in.next().toUpperCase().charAt(0);
		if (answer == 'Y') {
			return isSymbol = true;
		} else {
			return isSymbol = false;
		}
	}
	
	// Method to generate password
	public String generator() {
		if (isUppercase) sb.append(uppercasePart);
		if (isLowercase) sb.append(lowercasePart);
		if (isNumber) sb.append(numberPart);
		if (isSymbol) sb.append(symbolPart);
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
		
	
		
	

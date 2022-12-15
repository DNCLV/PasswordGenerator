# PasswordGenerator
The Password Generator is used to create a random password from different inputs from the user(console).
The user determines whether or not the user wants uppercase, lowercase, symbols, numbers or a combination of the four in the password.
Furthermore the user determines the length of the password.

For future improvement:

1.Exception handling for console inputs(Scanner) - Example InputMismatchException on Scanner.nextInt(). My issue is that I cannot figure out how to return the value, if I use a try catch method to avoid the user, inputting the wrong in the wrong data type. ✔

2.Password Validator - A validator that will deem a password secure or not, based on subjective values - this will only be valid if the generated password has an uneven mix of the chosen preferences. As of now, the password has the same amount of symbols as numbers (if both is chosen),

3.Password Length requirement of minimum 8 characters.

4. One major issue with the program:

When choosing to use uppercase, lowercase, symbols and numbers in the password, the math behind it is passwordlength(from user input) / the number of preferences chosen (using uppercase, lowercase and symbols is 3).

If the password is a odd number and the number of preferences is even, the password will be shorter than the user input of the password 

(Example: Password length of 13 and number of preferences 4 = password length of 12)



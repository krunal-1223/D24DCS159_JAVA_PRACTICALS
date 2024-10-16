
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class UserDefinedExceptionDemo {

    // Method to validate age
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            // Throwing a user-defined exception
            throw new InvalidAgeException("Age is less than 18. You are not eligible.");
        } else {
            System.out.println("You are eligible.");
        }
    }

    public static void main(String[] args) {
        int age = 16; // Example age

        try {
            // Method call that may throw a user-defined exception
            validateAge(age);
        } catch (InvalidAgeException e) {
            // Handling the user-defined exception
            System.out.println("Caught exception: " + e.getMessage());
 }
}
}

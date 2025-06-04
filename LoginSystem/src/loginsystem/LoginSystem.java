import java.util.Scanner;

public class LoginSystem {
    // Correct credentials for validation
    private static final String CORRECT_USERNAME = "kim";
    private static final String CORRECT_PASSWORD = "1234";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attempts = 3;

        while (attempts > 0) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = getMaskedPassword(scanner);

            // Validate credentials
            if (username.equals(CORRECT_USERNAME) && password.equals(CORRECT_PASSWORD)) {
                System.out.println("Login successful! Welcome, " + username + ".");
                break;
            } else {
                attempts--;
                System.out.println("Invalid username or password. " + attempts + " attempts left.");
                if (attempts > 0) {
                    System.out.println("Please try again."); // Prompt for next attempt
                } else {
                    System.out.println("Account locked. Contact support."); // After last attempt
                }
            }
        }

        scanner.close();
    }

    // Method to mask password input
    private static String getMaskedPassword(Scanner scanner) {
        char[] passwordChars = scanner.nextLine().toCharArray();
        StringBuilder maskedPassword = new StringBuilder();
        for (char c : passwordChars) {
            System.out.print("*");
            maskedPassword.append(c);
        }
        System.out.println(); // New line after password input
        return maskedPassword.toString();
}
}
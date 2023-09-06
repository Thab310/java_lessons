public class DateValidator {
    public static String validateDateOfBirth(String prompt) {
        String dateOfBirth;
        while (true) {
            dateOfBirth = Prompter.promptForString(prompt);
            if (dateOfBirth.matches("\\d{2}/\\d{2}/\\d{4}")) {
                break;
            } else {
                System.out.println("Invalid date format. Please enter in DD/MM/YYYY format.");
            }
        }
        return dateOfBirth;
    }
}

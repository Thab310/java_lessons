public class NumberValidator {
    public static double validateNumber(String prompt) {
        double number;
        while (true) {
            String input = Prompter.promptForString(prompt);
            try {
                number = Double.parseDouble(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
        return number;
    }
}

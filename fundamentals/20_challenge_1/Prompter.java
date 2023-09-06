import java.util.Scanner;

public class Prompter {
    public static String promptForString(String prompt) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(prompt);
        return scanner.nextLine();
        
    }
}

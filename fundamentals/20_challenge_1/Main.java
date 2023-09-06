public class Main {
    public static void main(String[] args) {
        // Part 1: Prompt for user information
        String name = Prompter.promptForString("What is your name:");
        String surname = Prompter.promptForString("What is your surname:");
        String dateOfBirth = DateValidator.validateDateOfBirth("Enter your date of birth (DD/MM/YYYY):");
        double distanceFromStore = NumberValidator.validateNumber("How far is your favorite store from your home?");

        // Part 2: Calculate age
        int birthYear = Integer.parseInt(dateOfBirth.split("/")[2]);
        int currentYear = java.time.Year.now().getValue();
        int age = currentYear - birthYear;

        // Part 3: Convert distance to miles
        double distanceInMiles = MilesCalculator.convertToMiles(distanceFromStore);
        double distanceInMeters = distanceFromStore * 1000; // 1 km = 1000 meters
        long ageInSeconds = age * 365 * 24 * 60 * 60; // Approximation of seconds in a year
        long ageInMilliseconds = ageInSeconds * 1000;

        // Display user information using Printer class
        String fullName = name + " " + surname;
        String hexDateOfBirth = String.format("%02X/%02X/%04X", Integer.parseInt(dateOfBirth.split("/")[0]), Integer.parseInt(dateOfBirth.split("/")[1]), Integer.parseInt(dateOfBirth.split("/")[2]));
        String binaryDateOfBirth = String.format("%8s/%8s/%16s",
                Integer.toBinaryString(Integer.parseInt(dateOfBirth.split("/")[0])),
                Integer.toBinaryString(Integer.parseInt(dateOfBirth.split("/")[1])),
                Integer.toBinaryString(Integer.parseInt(dateOfBirth.split("/")[2])));

        Printer.printUserInfo(fullName, age);
        Printer.printDistanceInfo(distanceInMiles, distanceInMeters);
        Printer.printAgeInfo(ageInSeconds, ageInMilliseconds);
        Printer.printBirthdayInfo(hexDateOfBirth, binaryDateOfBirth);
    }
}

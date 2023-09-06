public class Printer {
    public static void printUserInfo(String fullName, int age) {
        System.out.println("Hello " + fullName);
        System.out.println("You are " + age + " years old.");
    }

    public static void printDistanceInfo(double distanceInMiles, double distanceInMeters) {
        System.out.println("Distance in miles: " + distanceInMiles);
        System.out.println("Distance in meters: " + distanceInMeters);
    }

    public static void printAgeInfo(long ageInSeconds, long ageInMilliseconds) {
        System.out.println("Age in seconds: " + ageInSeconds);
        System.out.println("Age in milliseconds: " + ageInMilliseconds);
    }

    public static void printBirthdayInfo(String hexDateOfBirth, String binaryDateOfBirth) {
        System.out.println("Birthday in hex: " + hexDateOfBirth);
        System.out.println("Birthday in binary: " + binaryDateOfBirth);
    }
}

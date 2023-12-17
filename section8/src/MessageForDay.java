public class MessageForDay {

    public static void main(String[] args) {

        String dayOfWeek = "Wednesday";

        if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")) {
            System.out.println("Hooray, it's the weekend!");
            if (dayOfWeek.equals("Saturday")) {
                System.out.println("Time for a relaxing day or maybe some outdoor activities!");
            } else {
                System.out.println("Lazy Sunday vibes perfect for a cozy day indoors.");
            }
        } else {
            System.out.println("It's a weekday. Time to work or attend classes.");
            if (dayOfWeek.equals("Wednesday") || dayOfWeek.equals("Thursday")
                    || dayOfWeek.equals("Friday")) {
                System.out.println("Midweek hustle! Keep going, the weekend is approaching.");
            } else {
                System.out.println("Monday blues? Grab some coffee and power through the day!");
            }
        }

    }

}

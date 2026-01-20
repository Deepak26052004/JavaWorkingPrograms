import java.util.*;

class hackerrank_day_prgm {

    // Function to find the day of the week
    public static String findDay(int month, int day, int year) {
        // Create a Calendar instance
        Calendar cal = Calendar.getInstance();
        
        // Set the date in the calendar (month - 1 because Calendar months start from 0)
        cal.set(year, month - 1, day);
        
        // Get the day of the week (1 = Sunday, 2 = Monday, ...)
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        
        // Map the integer to the corresponding day name
        String[] days = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", 
                         "THURSDAY", "FRIDAY", "SATURDAY"};
        
        // Return the day name
        return days[dayOfWeek - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter day (1-31): ");
        int day = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        // Call the findDay function
        String dayName = findDay(month, day, year);

        // Print the result
        System.out.println("Day of the week: " + dayName);

        sc.close();
    }
}



public class DaysToVisit {

    static int daysRemining(int days, int minutesPerHour, int hoursPerDay) {
     
        int totalMinutes = days * hoursPerDay*minutesPerHour;

        System.out.println("I'll be back in " + totalMinutes + " Minutes!");

        return days;
    }

    public static void main(String[] args) {
        int hoursPerDay = 24;
        int minutesPerHour= 60;
        int days = 5;
        int totalMinutes = daysRemining(5, 60, 24);
    }
    
}

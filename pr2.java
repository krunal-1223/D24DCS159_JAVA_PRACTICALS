import java.util.*;
public class pr2 {
    public static void main(String[] args) {
        Scanner myObj=new Scanner(System.in);
        System.out.print("Enter the distance: ");
        double distance=myObj.nextDouble();
        System.out.print("Enter the time taken in hours: ");
        double time_h=myObj.nextDouble();
        System.out.print("Enter the time taken in minute: ");
        double time_m=myObj.nextDouble();
        System.out.print("Enter the time taken in seconds: ");
         double time_s=myObj.nextDouble();
        double totalSeconds = (time_h * 3600);

        // Calculate speed in meters per second
        double speedMetersPerSecond = distance /totalSeconds;

        // Calculate speed in kilometers per hour
        double speedKilometersPerHour = (distance / 1000) / time_h;

        // Calculate speed in miles per hour
        double speedMilesPerHour = distance/1609;

        System.out.println("Speed in meters per second: " + speedMetersPerSecond);
        System.out.println("Speed in kilometers per hour: " + speedKilometersPerHour);
        System.out.println("Speed in miles per hour: " + speedMilesPerHour);
        

    }
}

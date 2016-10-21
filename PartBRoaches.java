import java.util.Scanner;

public class PartBRoaches
{
    public static void main(String[] args)
    {
        final double GROWTH_RATE = 0.95;
        final double VOLUMEOFONEROACH = 0.002;
        int houseVolume = 0;
        double numberOfRoaches = 0;
        int weekNumber, calculatedNumberOfRoaches;
        double numberOfNewRoaches = numberOfRoaches;
        double volumeOfRoaches = 0;
        double volumeOfNewRoaches = volumeOfRoaches;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is the volume of the infested house in cubic feet? ");
        houseVolume = Integer.parseInt(keyboard.nextLine());
        System.out.print("What is the number of roaches currently infesting the home? ");
        numberOfRoaches = Integer.parseInt(keyboard.nextLine());
        weekNumber = 0;
        volumeOfRoaches = VOLUMEOFONEROACH * numberOfRoaches;
        System.out.println("\nHouse volume (cubic ft.): "+houseVolume);
        System.out.printf("Number of Roaches: %.0f\n",numberOfRoaches);
        while (volumeOfRoaches < houseVolume)
        {
            numberOfNewRoaches = GROWTH_RATE * numberOfRoaches;
            volumeOfNewRoaches = VOLUMEOFONEROACH * numberOfNewRoaches;
            numberOfRoaches += numberOfNewRoaches;
            volumeOfRoaches += volumeOfNewRoaches;
            weekNumber++;
        }
        System.out.println("\n" + weekNumber + " weeks");
        System.out.printf("%.0f roaches",numberOfRoaches);
        System.out.printf("\nVolume of %.0f cubic ft.",volumeOfRoaches);
    }
}
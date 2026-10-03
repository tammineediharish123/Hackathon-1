import java.util.Scanner;
public class RooftopSolarEnergyMonitor {
    // Method for 2c
    static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
          // 2a) Data Types
        int panelId;
        double energyGenerated;
        int numberOfPanels;
        char systemStatus;

        System.out.print("Enter Panel ID: ");
        panelId = sc.nextInt();

        System.out.print("Enter Energy Generated (kWh): ");
        energyGenerated = sc.nextDouble();

        System.out.print("Enter Number of Solar Panels: ");
        numberOfPanels = sc.nextInt();

        System.out.print("Enter System Status: ");
        systemStatus = sc.next().charAt(0);

        System.out.println("\n--- Solar System Details ---");
        System.out.println("Panel ID: " + panelId);
        System.out.println("Energy Generated: " + energyGenerated + " kWh");
        System.out.println("Number of Solar Panels: " + numberOfPanels);
        System.out.println("System Status: " + systemStatus);
            // 2b) If-Else Condition
        System.out.println("\n--- Energy Status ---");

        if (energyGenerated >= 10) {
            System.out.println("Good Energy Generation");
        } else {
            System.out.println("Low Energy Generation");
        }
         // 2c) Method
        double morningEnergy;
        double eveningEnergy;

        System.out.print("\nEnter Morning Energy (kWh): ");
        morningEnergy = sc.nextDouble();

        System.out.print("Enter Evening Energy (kWh): ");
        eveningEnergy = sc.nextDouble();

        double totalEnergy = calculateTotalEnergy(morningEnergy, eveningEnergy);

        System.out.println("Total Energy Generated: " + totalEnergy + " kWh");

        sc.close();
    }
    }
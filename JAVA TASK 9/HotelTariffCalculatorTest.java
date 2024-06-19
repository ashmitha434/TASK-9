import java.util.Scanner;

public class HotelTariffCalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input month, room rent per day, and number of days stayed
        int month = scanner.nextInt();
        double roomRent = scanner.nextDouble();
        int numDays = scanner.nextInt();

        // Caluculate the hotel tarriff
        double totalTariff;
        switch (month){
            case 4:
            case 5:
            case 6:
            case 11:
            case 12:
            //20% higher room rent during peak seasons
            totalTariff = roomRent * numDays * 1.2;
            break;
            default:
            totalTariff = roomRent * numDays;
            break;
        }
        // Print the hotel tariff with 2 decimal places
        System.out.printf("%2f\n", totalTariff);

        scanner.close();

    }
    
}

import java.util.Scanner;

public class IT24104184Lab5Q3 {
   
    private static final int ROOM_CHARGE_PER_DAY = 48000;
    private static final int DISCOUNT_3_TO_4_DAYS = 10;  
    private static final int DISCOUNT_5_OR_MORE_DAYS = 20;  

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter the start date of the reservation (1-31): ");
        int startDate = scanner.nextInt();
        System.out.print("Enter the end date of the reservation (1-31): ");
        int endDate = scanner.nextInt();

       
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Dates must be between 1 and 31.");
            return;  
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start date must be earlier than end date.");
            return;  
        }

       
        int daysReserved = endDate - startDate;

       
        int discount = 0;
        if (daysReserved >= 5) {
            discount = DISCOUNT_5_OR_MORE_DAYS;
        } else if (daysReserved >= 3) {
            discount = DISCOUNT_3_TO_4_DAYS;
        }

       
        int totalAmount = ROOM_CHARGE_PER_DAY * daysReserved;
        int discountAmount = (totalAmount * discount) / 100;
        int finalAmount = totalAmount - discountAmount;

       
        System.out.println("Number of days reserved: " + daysReserved);
        System.out.println("Original total amount: Rs " + totalAmount);
        System.out.println("Discount applied: " + discount + "%");
        System.out.println("Discount amount: Rs " + discountAmount);
        System.out.println("Total amount to be paid: Rs " + finalAmount);

       
        scanner.close();
    }
}
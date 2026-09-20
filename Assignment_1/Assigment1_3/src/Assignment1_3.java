import java.util.Scanner;

public class Assignment1_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        int quantity;
        double totalBill = 0;

        while (true) {

            System.out.println("\n----- FOOD MENU -----");
            System.out.println("1. Dosa       - Rs. 50");
            System.out.println("2. Samosa     - Rs. 20");
            System.out.println("3. Idli       - Rs. 40");
            System.out.println("4. Vada       - Rs. 30");
            System.out.println("5. Poha       - Rs. 30");
            System.out.println("6. Upma       - Rs. 35");
            System.out.println("7. Misal       - Rs. 60");
            System.out.println("8. Tea         - Rs. 15");
            System.out.println("9. Coffee      - Rs. 25");
            System.out.println("10. Generate Bill");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 10) {
                System.out.println("\nTotal Bill = Rs. " + totalBill);
                break;
            }

            System.out.print("Enter quantity: ");
            quantity = sc.nextInt();

            switch (choice) {

                case 1:
                    totalBill = totalBill + (50 * quantity);
                    break;

                case 2:
                    totalBill = totalBill + (20 * quantity);
                    break;

                case 3:
                    totalBill = totalBill + (40 * quantity);
                    break;

                case 4:
                    totalBill = totalBill + (30 * quantity);
                    break;

                case 5:
                    totalBill = totalBill + (30 * quantity);
                    break;

                case 6:
                    totalBill = totalBill + (35 * quantity);
                    break;

                case 7:
                    totalBill = totalBill + (60 * quantity);
                    break;

                case 8:
                    totalBill = totalBill + (15 * quantity);
                    break;

                case 9:
                    totalBill = totalBill + (25 * quantity);
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
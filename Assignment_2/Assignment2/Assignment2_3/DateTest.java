public class DateTest {

    public static void main(String[] args) {

        Date date1 = new Date(9, 20, 2026);

        System.out.println("Date:");
        date1.displayDate();

        System.out.println();

        // Changing date
        date1.setMonth(10);
        date1.setDay(15);
        date1.setYear(2026);

        System.out.println("Updated Date:");
        date1.displayDate();
    }
}
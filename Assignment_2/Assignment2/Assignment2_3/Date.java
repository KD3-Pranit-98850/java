public class Date {

    private int month;
    private int day;
    private int year;

    // Constructor
    public Date(int month, int day, int year) {

        this.month = month;
        this.day = day;
        this.year = year;
    }

    // Set and Get methods for month
    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    // Set and Get methods for day
    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    // Set and Get methods for year
    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    // Display date
    public void displayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }
}
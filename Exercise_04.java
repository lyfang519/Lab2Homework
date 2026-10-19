public class practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String year, month, day;
        System.out.println("Enter the year: ");
        year = sc.nextLine();
        System.out.println("Enter the month: ");
        month = sc.nextLine();
        System.out.println("Enter the day: ");
        day = sc.nextLine();
        while (year.length() != 4 || month.length() != 1 && month.length() != 2
                || day.length() != 1 && day.length() != 2) {
            System.out.println("Invalid date format. Please enter the date in the format YYYY-MM-DD.");
            return;
        }
        if (year.compareTo("2026") > 0 || month.compareTo("12") > 0 || day.compareTo("32") > 0) {
            System.out.println("Invalid date. Please enter a valid date.");
        }
        System.out.println("Input: " + year + "-" + month + "-" + day);
        System.out.println("Output: Valid");
        sc.close();
    }
}

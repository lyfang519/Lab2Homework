public class Exercise_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double Math, Physics, English, Programming;

        System.out.println("Enter the marks for Math: ");
        Math = sc.nextDouble();
        System.out.println("Enter the marks for Physics: ");
        Physics = sc.nextDouble();
        System.out.println("Enter the marks for English: ");
        English = sc.nextDouble();
        System.out.println("Enter the marks for Programming: ");
        Programming = sc.nextDouble();

        if (Math > Physics && Math > English && Math > Programming) {
            System.out.println("The maximum marks are: " + Math);
        } else if (Math < Physics && Math < English && Math < Programming) {
            System.out.println("The minimum marks are: " + Math);
        }

        if (Physics > Math && Physics > English && Physics > Programming) {
            System.out.println("The maximum marks are: " + Physics);
        } else if (Physics < Math && Physics < English && Physics < Programming) {
            System.out.println("The minimum marks are: " + Physics);
        }

        if (English > Math && English > Physics && English > Programming) {
            System.out.println("The maximum marks are: " + English);
        } else if (English < Math && English < Physics && English < Programming) {
            System.out.println("The minimum marks are: " + English);
        }

        if (Programming > Math && Programming > Physics && Programming > English) {
            System.out.println("The maximum marks are: " + Programming);
        } else if (Programming < Math && Programming < Physics && Programming < English) {
            System.out.println("The minimum marks are: " + Programming);
        }
        System.out.println("The average marks are: " + (Math + Physics + English + Programming) / 4);
        sc.close();
    }
}

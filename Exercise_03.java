public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, e;
        System.out.println("Input five numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();

        if (a > b && a > c && a > d && a > e) {
            System.out.println("The maximum number is: " + a);
        } else if (a < b && a < c && a < d && a < e) {
            System.out.println("The minimum number is: " + a);
        }

        if (b > a && b > c && b > d && b > e) {
            System.out.println("The maximum number is: " + b);
        } else if (b < a && b < c && b < d && b < e) {
            System.out.println("The minimum number is: " + b);
        }

        if (c > a && c > b && c > d && c > e) {
            System.out.println("The maximum number is: " + c);
        } else if (c < a && c < b && c < d && c < e) {
            System.out.println("The minimum number is: " + c);
        }

        if (d > a && d > b && d > c && d > e) {
            System.out.println("The maximum number is: " + d);
        } else if (d < a && d < b && d < c && d < e) {
            System.out.println("The minimum number is: " + d);
        }

        if (e > a && e > b && e > c && e > d) {
            System.out.println("The maximum number is: " + e);
        } else if (e < a && e < b && e < c && e < d) {
            System.out.println("The minimum number is: " + e);
        }
        sc.close();
    }
}

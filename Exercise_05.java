public class practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input n: ");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("There are no prime numbers in this range.");
            sc.close();
            return;
        }
        System.out.println("Output: ");
        System.out.print("All prime numbers from 2 to " + n + ": ");
        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        sc.close();
    }
}

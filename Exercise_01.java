public class Exercise_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int sum = 0;

        System.out.println("Enter a number: ");
        num = sc.nextInt();
        for (int i = 1000; i >= num; i--) {
            System.out.println("The number is: ");
            System.out.println(i);
            sum = sum + i;

        }
        System.out.println("Sum: " + sum);
        double avg;
        avg = sum / (1000 - num + 1);
        System.out.println("Average: " + avg);

        sc.close();
}
}

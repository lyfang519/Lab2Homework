public class Exercise_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===============================================");
        System.out.println("            Welcome to our program");
        System.out.println("'Quadratic Equation Solver ax^2 + bx + c = 0' ");
        System.out.println("===============================================");
        int a, b, c;
        System.out.print("Input a : ");
        a = sc.nextInt();
        System.out.print("Input b : ");
        b = sc.nextInt();
        System.out.print("Input c : ");
        c = sc.nextInt();
        double delta = (b * b) - (4 * a * c);
        if (delta < 0) {
            System.out.println("The equation has no real roots.");
        } else if (delta == 0) {
            double root = -b / (2 * a);
            System.out.println("The equation has one real root:" + root);
        } else {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("The equation has two real roots: " + root1 + root2);
            System.out.println("===============================================");
            System.out.println("Root of this equation :" + a + "x^2 + " + b + "x + " + c + " = 0 are : ");
            System.out.println("X1 = " + root1);
            System.out.println("X2 = " + root2);
            System.out.println("===============================================");
        }

        sc.close();
    }
}

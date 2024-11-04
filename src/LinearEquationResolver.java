import java.util.Scanner;

public class LinearEquationResolver {
    // [Thực hành] Giải phương trình bậc nhất (v.2023)
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given an equation as ax + b = c, please enter constants: ");

        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        double a = sc.nextDouble();

        System.out.print("b: ");
        double b = sc.nextDouble();

        System.out.print("c: ");
        double c = sc.nextDouble();

        if (a != 0) {
            double x = (c - b) / a;
            System.out.println("Equation pass with x = " + x);
        }
        else {
            if (b == c) {
                System.out.println("The solution is all x");
            } else {
                System.out.println("The equation has no solution");
            }
        }

    }
}

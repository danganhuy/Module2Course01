import java.util.Scanner;

public class BMICalculator {
    // [Thực hành] Tính chỉ số cân nặng của cơ thể (v.2023)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double weight, height, bmi;

        System.out.print("Enter Your Weight(kg): ");
        weight = sc.nextDouble();
        System.out.print("Enter Your Height(m): ");
        height = sc.nextDouble();
        bmi = weight / (height * height);

        System.out.printf("%-20s%s", "bmi", "Interpretation\n");
        if (bmi < 18) {
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        } else if (bmi < 25) {
            System.out.printf("%-20.2f%s", bmi, "Normal");
        } else if (bmi < 30) {
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        } else {
            System.out.printf("%-20.2f%s", bmi, "Obese");
        }
    }
}

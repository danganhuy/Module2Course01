import java.util.Scanner;

public class LeapYearCalculator {
    // [Thực hành] Kiểm tra năm nhuận (v.2023)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        if (year % 400 == 0) {
            System.out.println("Is Leap Year");
        } else if (year % 100 == 0) {
            System.out.println("Is Not Leap Year");
        } else if (year % 4 == 0) {
            System.out.println("Is Leap Year");
        } else {
            System.out.println("Is not Leap Year");
        }
    }
}

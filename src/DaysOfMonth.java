import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the month: ");
        int month = sc.nextInt();
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.printf("Month %d have 31 days", month);
                break;
            case 4: case 6: case 9: case 11:
                System.out.printf("Month %d have 30 days", month);
                break;
            case 2:
                System.out.printf("Month %d have 28 or 29 days", month);
                break;
            default:
                System.out.printf("%d is not a month", month);
                break;
        }
    }
}

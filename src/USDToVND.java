import java.util.Scanner;

public class USDToVND {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập USD: ");
        double USD = sc.nextDouble();

        double VND = USD * 23000;
        System.out.println("Đổi sang VND: " + VND);
    }
}

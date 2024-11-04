import java.util.Scanner;

public class OperatorExpression {
    // [Thực hành] Sử dụng toán tử (v.2023)
    public static void main(String[] args) {
        float width;
        float height;

        Scanner sn = new Scanner(System.in);

        System.out.print("Enter width: ");
        width = sn.nextFloat();

        System.out.print("Enter height: ");
        height = sn.nextFloat();

        float area = width * height;
        System.out.print("Area: " + area);
    }
}

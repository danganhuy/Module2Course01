import java.util.Scanner;

public class ReadNumber {
    // [Bài tập] Ứng dụng đọc số thành chữ
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 999) {
            System.out.println("The number is too large.");
            return;
        }
        String s = numberToWord(num);
        System.out.println(num + " = " + s);

//        for (int i = 0; i < 1000; i ++) {
//            String s = numberToWord(i);
//            System.out.println(i + " " + s);
//        }
    }
    public static String numberToWord(int num) {
        if (num == 0) {
            return "zero";
        }
        if (num > 999) {
            return "The number is too large.";
        }
        String s;
        int remainder = num % 100;
        if (remainder < 10 || remainder > 19) {
            String unit;
            switch (remainder % 10) {
                case 1: unit = "one"; break;
                case 2: unit = "two"; break;
                case 3: unit = "three"; break;
                case 4: unit = "four"; break;
                case 5: unit = "five"; break;
                case 6: unit = "six"; break;
                case 7: unit = "seven"; break;
                case 8: unit = "eight"; break;
                case 9: unit = "nine"; break;
                default: unit = ""; break;
            }
            String dozen;
            switch ((int) (remainder / 10f)) {
                case 2: dozen = "twenty "; break;
                case 3: dozen = "thirty "; break;
                case 4: dozen = "forty "; break;
                case 5: dozen = "fifty "; break;
                case 6: dozen = "sixty "; break;
                case 7: dozen = "seventy "; break;
                case 8: dozen = "eighty "; break;
                case 9: dozen = "ninety "; break;
                default: dozen = ""; break;
            }
            s = dozen + unit;
        }
        else {
            switch (remainder) {
                case 10: s = "ten"; break;
                case 11: s = "eleven"; break;
                case 12: s = "twelve"; break;
                case 13: s = "thirteen"; break;
                case 14: s = "fourteen"; break;
                case 15: s = "fifteen"; break;
                case 16: s = "sixteen"; break;
                case 17: s = "seventeen"; break;
                case 18: s = "eighteen"; break;
                case 19: s = "nineteen"; break;
                default: s = ""; break;
            }
        }
        String hundred;
        switch ((int) (num / 100f)) {
            case 1: hundred = "one hundred and "; break;
            case 2: hundred = "two hundred and "; break;
            case 3: hundred = "three hundred and "; break;
            case 4: hundred = "four hundred and "; break;
            case 5: hundred = "five hundred and "; break;
            case 6: hundred = "six hundred and "; break;
            case 7: hundred = "seven hundred and "; break;
            case 8: hundred = "eight hundred and "; break;
            case 9: hundred = "nine hundred and "; break;
            default: hundred = ""; break;
        }
        s = hundred + s;
        return s;
    }
}

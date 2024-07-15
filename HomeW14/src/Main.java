import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите любое целое не отрицательное число: ");
        int input = new Scanner(System.in).nextInt();
        System.out.println(avg(input));
    }

    public static double avg(int num) {
        String intStr = String.valueOf(num);
        double sum = 0;
        for(int i = 0; i < intStr.length(); i++){
            sum += Integer.parseInt(String.valueOf(intStr.charAt(i)));
        }
        return sum / intStr.length();
    }
}

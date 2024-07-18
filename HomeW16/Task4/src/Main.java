import java.util.Scanner;

public class Main {
    public static final String NUMBER_REGEX = "(\\d{3})(\\d{3})(\\d{2})(\\d{2})";
    public static final String NUMBER_FORMAT = "+38 ($2) $3 $4-$5";
    public static final String SHORT_NUMBER_FORMAT = "+38 ($1) $2 $3-$4";
    public static final int GOOD_NUMBER = 12;
    public static final int SO_NUMBER = 10;
    public static void main(String[] args) {
        System.out.print("Ведите номер телефона: ");
        String number = new Scanner(System.in).nextLine();
        number = number.replaceAll("\\D+", "");
        if(number.length() == GOOD_NUMBER) {
            number = number.replaceAll("(\\d{2})"+NUMBER_REGEX, NUMBER_FORMAT);
            System.out.println(number);
        } else if (number.length() == SO_NUMBER){
            number = number.replaceAll(NUMBER_REGEX, SHORT_NUMBER_FORMAT);
            System.out.println(number);
        } else {
            System.out.println("Не верный номер!");
        }
    }
}
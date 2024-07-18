import java.util.Scanner;

public class Main {
    private static final String VALID_REGEX = "((([А-я]+)|([А-я-]+))\\s){2}(([А-я]+)|([А-я-]+))";
    private static final int SURNAME_NUM = 0;
    private static final int NAME_NUM = 1;
    private static final int PATRONYMIC_NUM = 2;

    public static void main(String[] args) {
        System.out.println("Введите Ф.И.О ниже ");
        String fio = new Scanner(System.in).nextLine();
        if(fio.matches(VALID_REGEX)){
            String[] split = fio.split("\\s+");
            System.out.println("Фамилия: " + split[SURNAME_NUM]);
            System.out.println("Имя: " + split[NAME_NUM]);
            System.out.println("Отчество: " + split[PATRONYMIC_NUM]);
        } else {
            System.out.println("Введенная строка не является ФИО");
        }
    }
}
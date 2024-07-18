import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(textCorrect(inputText()));
    }

    public static String inputText() {
        System.out.println("Введите текс на английсом языке не менее 100 слов: ");
        return new Scanner(System.in).nextLine();
    }

    public static String textCorrect(String inputText) {
        inputText = inputText.replaceAll("[+*/,-.!?:]","").trim();
        return inputText.replaceAll("\\s", "\n");
    }
}
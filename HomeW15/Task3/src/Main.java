import java.util.Scanner;

public class Main {
    public static final String CORRECT_CHARS = " абвгдеёжзийклмнопрстуфхцчшщъыьэюя";

    public static void main(String[] args) {
        //1 ввод тольку русских маленьких букв
        //2 не больше 2х слов
        //3 возвращать второе слово

        String input = new Scanner(System.in).nextLine().trim();
        boolean isValid = true;
        int spaceCount = 0;

        for(int i=0; i<input.length(); i++){
            if(input.charAt(i) == ' '){
                spaceCount++;
            }
            if(!CORRECT_CHARS.contains(String.valueOf(input.charAt(i)))) {
                isValid = false;
                break;
            }
        }
        if(isValid && spaceCount == 1){
            System.out.println(input.substring(input.indexOf(' ')).trim());
        } else {
            System.out.println("Ввод не коректен!");
        }
    }
}

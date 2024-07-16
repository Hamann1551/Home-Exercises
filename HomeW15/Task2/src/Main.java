import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        fioResult(fio());
    }

    public static String fio(){
        System.out.print("Добрый день введите своё Ф.И.О.: ");
        return new Scanner(System.in).nextLine();
    }

    public static void fioResult(String fio){
        int flagSpace = 0;
        String surname="",name="",patronymic="";

        for(int i=0; i < fio.length(); i++){
            if(fio.charAt(i) == ' '){
                flagSpace++;
            }
            surname = fio.substring(0, fio.indexOf(' ')).trim();
            name = fio.substring(fio.indexOf(' '), fio.lastIndexOf(' ')).trim();
            patronymic = fio.substring(fio.lastIndexOf(' ')).trim();
        }

        if(flagSpace == 2) {
            System.out.println("Surname: " + surname + "\nName: " + name + "\nPatronymic: " + patronymic);
        } else {
            System.out.println("Введенная строка не является ФИО");
        }
    }
}
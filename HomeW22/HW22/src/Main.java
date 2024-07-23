import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final String INDEX_REGEX = "^\\d+";
    private static final String INDEX_ADD_TODO = "(\\d+)(\\s+)(.+)";

    private static List<String> todos = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("\t\tДобро пожаловать в программу по составлению списка дел!\n\n");
        String info = "Достпные команды:\n" +
                "Добавить дело\n" +
                "Добавить номер дело\n" +
                "Удалить номер\n" +
                "Изменить номер новое дело\n" +
                "Печать\n" +
                "Выход\n" +
                "Инфо";
        System.out.println(info + "\n");
        while (true) {
            System.out.println("Ведите команду: ");
            String input = new Scanner(System.in).nextLine();

            String command = input;
            String payload = "";

            if(input.contains(" ")) {
                String[] lexemes = input.split("\\s+", 2);
                command = lexemes[0];
                payload = lexemes[1].trim();
            } else {
                command = input;
            }

            if(command.toLowerCase().equals("добавить")) {
                if(payload.matches(INDEX_ADD_TODO)) {
                    Integer index = Integer.parseInt(payload.replaceAll(INDEX_ADD_TODO, "$1"));
                    String todo = payload.replaceAll(INDEX_REGEX, "").trim();
                    add(todo,index);
                } else {
                    add(payload);
                }
            } else if (command.toLowerCase().equals("удалить")) {
                Integer index = Integer.parseInt(payload);
                delete(index);
            } else if (command.toLowerCase().equals("изменить")) {
                Integer index = Integer.parseInt(payload.replaceAll(INDEX_ADD_TODO, "$1"));
                String newTodo = payload.replaceAll(INDEX_REGEX,"").trim();
                edit(newTodo,index);
            } else if (command.toLowerCase().equals("печать")) {
                print();
            } else if (command.toLowerCase().equals("выход")) {
                System.out.println("До свидания!");
                return;
            } else {
                System.out.println("Ввод был не верный!\n\n" + info);
            }
        }
    }

    public static void add (String todo) {
        todos.add(todo);
        System.out.println("Дело \"" + todo + "\" успешно добавлено.");
    }

    public static void add (String todo, Integer index) {
        if(index >= todos.size()) {
            todos.add(todo);
            System.out.println("Нет места под номером" + index + ". Дело \"" + todo + "\" было добавлено в конце списка.");
            return;
        }
        todos.add(index,todo);
        System.out.println("На " + index + " номер было добавлено дело \"" + todo + "\"");
    }

    public static void delete(Integer index) {
        if(index >= todos.size()) {
            System.out.println("Дело с номером" + index + " не существует!");
            return;
        }
        String todo = todos.get(index);
        todos.remove(todo);
        System.out.println("Дело под номером " + index + " и названием " + todo + " было удалено.");
    }

    public static void edit(String newTodo, Integer index) {
        if(index >= todos.size()) {
            System.out.println("Дела под номером " + index + " не существует!");
            return;
        }

        String todoOld = todos.get(index);
        todos.set(index, newTodo);
        System.out.println("Дело " + todoOld + " измененино на " + newTodo);
    }

    public static void print() {
        if(todos.isEmpty()) {
            System.out.println("Список пуст!");
            return;
        }

        for(String todo : todos) {
            System.out.println(todo);
        }
    }
}

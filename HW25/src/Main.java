import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<Human> humanSupplier = () -> {
            System.out.print("Ведите имя: ");
            String name = new Scanner(System.in).nextLine();
            System.out.print("Ведите возраст: ");
            int age = new Scanner(System.in).nextInt();
            System.out.print("Ведите рост: ");
            double height = new Scanner(System.in).nextDouble();
            return new Human(name, age, height);
        };

        Human human1 = humanSupplier.get();

        Predicate<Integer> old = (age) -> age >= 18;

        System.out.println(human1.getName() + " - овершенолетний: " + old.test(human1.getAge()));
    }
}
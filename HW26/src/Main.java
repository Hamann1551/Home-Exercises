import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Task1
        Set<Set<String>> sets = new HashSet<>();
        Set<String> strings = new HashSet<>();
        strings.add("раз");
        strings.add("два");
        strings.add("три");
        Set<String> strings2 = new HashSet<>();
        strings2.add("Первое");
        strings2.add("Второе");
        strings2.add("Семьдесят шестое");
        Set<String> strings3 = new HashSet<>();
        strings3.add("12");
        strings3.add("783");
        strings3.add("37288736");
        Set<String> strings4 = new HashSet<>();
        strings4.add("Проверка");
        strings4.add("Струн");
        strings4.add("Раз-Два");

        sets.add(strings);
        sets.add(strings2);
        sets.add(strings3);
        sets.add(strings4);

        int sumAbc = sets.stream()
                .flatMap(s -> s.stream())
                .mapToInt(s ->s.length())
                .sum();
        System.out.println(sumAbc);

        int maxSize = sets.stream()
                .flatMap(s->s.stream())
                .mapToInt(s->s.length())
                .max().getAsInt();
        System.out.println(maxSize);
        //Task2
        System.out.println("--------------------------------------------------------------------------");
        List<Employee> employees = EmployeeFactory.createEmployee();
        Employee employee = employees.stream()
                .max(Comparator.comparing(Employee::getKpi))
                .get();
        System.out.println("Max kpi: " + employee);
        System.out.println("--------------------------------------------------------------------------");
        Employee employee1 = employees.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .get();
        System.out.println("Max salary: " + employee1);
        System.out.println("--------------------------------------------------------------------------");
        Employee employee2 = employees.stream()
                .filter(e->e.getName().matches("\\w+"))
                .findFirst()
                .get();
        System.out.println("Abroad name: " + employee2);
        System.out.println("--------------------------------------------------------------------------");
        double avdKpi = employees.stream()
                .mapToInt(e->e.getKpi())
                .average()
                .getAsDouble();
        employees.stream()
                .filter(e->e.getKpi() > avdKpi)
                .forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------------");
        double sredKpi = employees.stream()
                .filter(e->e.getName().matches("[А-я]+"))
                .filter(e->e.getAge() < 45)
                .filter(e->e.getSalary() > 20000)
                .mapToInt(e->e.getKpi())
                .average().orElse(0);
        System.out.println("Sred kpi: " + sredKpi);
        System.out.println("--------------------------------------------------------------------------");

        Map<String, Employee> employeeMap = employees.stream()
                .filter(e->e.getAge() < 35 && e.getSalary() > 10000)
                .collect(Collectors.toMap(e->e.getName() + e.getSurname(), e->e));

        for(Map.Entry<String, Employee> entry : employeeMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
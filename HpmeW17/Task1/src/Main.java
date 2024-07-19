import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        Wine wine1 = new Wine("Блукс", "Новое", "Украина",
                LocalDate.of(2001,1,1),
                "Самое вкусное белое вино");
        wine1.winePeriod(LocalDate.of(2010,1,1));
    }
}
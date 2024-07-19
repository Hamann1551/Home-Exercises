import java.time.LocalDate;
import java.time.Period;

public class Wine {
    private String title;
    private String mark;
    private String country;
    private LocalDate date;
    private String description;

    public Wine() {}

    public Wine(String title, String mark, String country, LocalDate date, String description){
        this.title = title;
        this.mark = mark;
        this.country = country;
        this.date = date;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getMark() {
        return mark;
    }
    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public void winePeriod(LocalDate now) {
        int years = Period.between(date, now).getYears();
        System.out.println("Выдержка вина составляет " + years + " лет");
    }
}

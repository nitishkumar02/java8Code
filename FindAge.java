import java.time.LocalDate;
import java.time.Period;

 class FindAge{
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1993,06,28);
        Period p = Period.between(birthday,today);
        System.out.printf("age is %d year, %d months, %d days",p.getYears(),p.getMonths(),p.getDays());
    }
}

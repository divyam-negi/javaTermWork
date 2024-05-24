import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter birthdate: ");
        String input = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate birthdate = LocalDate.parse(input, formatter);

        LocalDate currentDate = LocalDate.now();
        long daysGap = ChronoUnit.DAYS.between(birthdate, currentDate);

        System.out.println("Number of days gap in your age: " + daysGap + " days");

        scanner.close();
    }
}


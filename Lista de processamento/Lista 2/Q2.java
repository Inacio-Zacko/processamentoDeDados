import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q2 {
public static void main(String[] args) {
	DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy HH:mm:ss");
    System.out.println("Atualmente:  "+dtf3.format(LocalDateTime.now()));
}
}

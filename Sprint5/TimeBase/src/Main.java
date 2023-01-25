import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        TimeClient timeClient = new TimeClient();
        timeClient.setDateTime(3,50,25,1,2023);
        timeClient.getTime();
    }
}
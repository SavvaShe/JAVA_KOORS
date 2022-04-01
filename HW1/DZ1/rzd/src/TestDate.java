import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TestDate {
    public static void main(String[] args) {
        var date = new Date();
//        System.out.println(date);
        var formatDate = new SimpleDateFormat("dd.MM.YYYY",new Locale("ru"));
        System.out.println(formatDate.format(date));
    }
}

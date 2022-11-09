import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatter {

    static final String date = "";
    static final String date2 = "";


    public static  void stringIntoDate( String date) throws ParseException {

        DateFormat df = new SimpleDateFormat("mm/dd/yyyy");
        Date startDate = df.parse(date);
        System.out.println(startDate);

    }

    public static void dateIntoString(String date2){
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        String strDate = dateFormat.format(date);
        System.out.println(strDate);
    }
}
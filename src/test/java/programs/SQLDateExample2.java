package programs;

import java.sql.Date;

public class SQLDateExample2 {
    public static void main(String[] args) {
        String s = "2022-09-15";
        //Converting string into SQL date
        Date date = Date.valueOf(s);
        System.out.println(date);
    }
}

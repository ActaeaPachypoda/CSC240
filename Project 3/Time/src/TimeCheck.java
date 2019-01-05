/**
 * Created by Sarah Shaw on 4/15/2018
 */
import java.util.Arrays;

public class TimeCheck{
    public static void main(String args[]){
        Time [] t = {new Time(3, 15), new Time(16, 0), new Time(4, 29),
                new Time(11, 59), new Time(23, 11), new Time(2, 59), new Time (4, 9) };

        Arrays.sort(t);
        for (Time f: t)
            System.out.println(f+",");
    }
}
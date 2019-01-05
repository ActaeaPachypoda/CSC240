/**
 * Created by Sarah Shaw on 4/15/2018
 */
public class Time implements Comparable
{
    private int hour =0;
    private int minute =0;
    public Time (int h, int m){
        if (h<0||h>23) return;
        if(m<0||m>59) return;
        hour = h;
        minute = m;
    }

    /**This method is the accessor for the hour variable
     * @return - Returns the hour variable
     */
    public int getHour() {
        return hour;
    }

    /**This method is the mutator for the hour variable
     * @param hour - The value the user would like to assign to the hour variable
     */
    public void setHour(int hour) {
        this.hour = hour;
    }

    /**This method is the accessor for the minute variable
     * @return - Returns the minute variable
     */
    public int getMinute() {
        return minute;
    }

    /**This method is the mutator for the minute variable
     * @param minute - The value the user would like to assign to the minute variable
     */
    public void setMinute(int minute) {
        this.minute = minute;
    }

    /**This method overrides the compareTo method so that two times can be compared to
     * find if one is earlier, later, or the same.
     * @param o - the object you would like to compare to the declared object
     * @return - Returns a positive, negative, or zero value after comparing two objects
     */
    @Override
    public int compareTo(Object o)
    {
        if ((o != null) && (o instanceof Time))
        {
            Time time2 = (Time) o;
            if (hour > time2.getHour())
                return 1;
            else if (hour < time2.getHour())
                return -1;
            else if (hour == time2.getHour())
            {
                if (minute > time2.getMinute())
                    return 1;
                else if (minute < time2.getMinute())
                    return -1;
                else if (minute == time2.getMinute())
                    return 0;
            }
        }
        return -1;
    }
    @Override
    public String toString() {
        return "(" + hour +
                ", " + minute +
                ')';
    }
}
public class Time
{
    private int hour;
    private int minute;


    public Time(int hour, int minute)
    {
    this.hour = hour;
    this.minute = minute;
    }

    public Time ()
    {    }
    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setTime(int hour, int minute, boolean isAM)
    {
        if (isAM==true)
        {
            this.hour=hour;
            this.minute=minute;
        }
        else {
            this.hour=hour+12;
            this.minute=minute;
        }
    }
    public boolean isValid(int hour, int minute)
    {
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flagFinal = false;
        if (hour >=0 && hour<=11)
            flag1=true;
        if (minute>=0 && minute<=59)
            flag2 = true;
        if (flag1==true && flag2 == true)
            flagFinal=true;
        return flagFinal;
    }

    public int compareTo(Time i)
    {
        int hourI = i.getHour();
        int minuteI = i.getMinute();
        int hour2 = this.getHour();
        int minute2 = this.getMinute();
        if (hourI < hour2)
            return 1;
        else if(hourI == hour2 && minuteI==minute2)
                return 0;
        else return -1;
    }

    public String toString() {
        return "("+ hour+", "+minute+")";
    }
}

import java.util.Scanner;

public class TimeCheck{
    public static void main(String args[]){
        Scanner kb = new Scanner(System.in);
        Time [] t = {new Time(), new Time(), new Time()};
        for(int i = 0; i<t.length; i++){
            int hour, minute;
            do{
                System.out.print("Input hour for set t"+i+":");
                hour = kb.nextInt();
                System.out.print("Input minute for set t"+i+":");
                minute = kb.nextInt();
            }while(!t[i].isValid(hour, minute));
            t[i].setTime(hour, minute, true);
        }
        System.out.println("--- after initialization ---");
        for(int i = 0; i<t.length; i++)
            System.out.println(t[i]);
        int r = t[1].compareTo(t[0]);
        System.out.println("The result of t[1].compareTo(t[0])"+r);

        t[1].setTime(t[1].getHour(), t[1].getMinute(), false);
        System.out.println("--- after resetting ---");
        for(int i = 0; i<t.length; i++)
            System.out.println(t[i]);
        r = t[1].compareTo(t[0]);
        System.out.println("The result of t[1].compareTo(t[0])"+r);
    }
}

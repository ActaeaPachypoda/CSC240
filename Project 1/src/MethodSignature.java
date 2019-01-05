
import java.util.Collections;

public class MethodSignature
{
   public static void main(String[] args)
   {
       System.out.println(sum(5,1));
       System.out.println(sum(11,3));
       stair(2, 5, 3);
       System.out.println(phoneword("1-800-Flowers"));
       System.out.println(phoneword("1-800-Contacts"));
       System.out.println(lengthOfMonth(2000,2));
       System.out.println(lengthOfMonth("1900", "February"));
       System.out.println(checkPalindrome("rotor"));
       System.out.println(checkPalindrome("redder"));
       System.out.println(checkPalindrome("motor"));
       System.out.println(myReverse("abc"));
       //primeList(1000);
       System.out.println(isPerfect(6));
       System.out.println(myLuckyNumber("290172"));
       System.out.println(myLuckyNumber("123456789012345"));
       System.out.println(legalPin("Abc2"));
       System.out.println(legalPin("ABCDEFG%"));
       System.out.println(legalPin("ABCdef23$"));
       System.out.println(legalPin("0123ABC$"));
       System.out.println(reverse("abc"));
       /*System.out.println(myReplace("abcabcabc", "abc", "123", 1));
       System.out.println(myReplace("abcabcabc", "abc", "123", 2));
       System.out.println(myReplace("abcabcabc", "abc", "123", 3));
       System.out.println(myReplace("abcabcabc", "abc", "123", 4));*/
   }
    public static int sum(int n1, int n2)
    {
        int temp=0;
        for(int i=1; i<=n1; i+=n2)
        {
            temp= temp+i;
        }
        return temp;
    }
    public static void stair(int x, int y, int z)
    {
        for(int i=0; i<x; i++)
        {
            String s= " ";
            String Y = "-";
            String repeated = new String(new char[y]).replace("\0",s);
            String step = new String(new char[y]).replace("\0",Y);
            System.out.println(String.join("", Collections.nCopies(i,repeated))+step);
            for(int k=1; k<=z;k++)
            {
                System.out.println( String.join("", Collections.nCopies(i+1,repeated))+ "|");
            }
        }
    }
    public static String phoneword(String x)
    {
        String phone = x;
        phone=phone.replaceAll("[a-cA-C]", "2");
        phone=phone.replaceAll("[d-fD-F]","3");
        phone=phone.replaceAll("[g-iG-I]","4");
        phone=phone.replaceAll("[j-lJ-L]","5");
        phone=phone.replaceAll("[m-oM-O]","6");
        phone=phone.replaceAll("[p-sP-S]","7");
        phone=phone.replaceAll("[t-vT-V]","8");
        phone=phone.replaceAll("[w-zW-Z]","9");
        return phone;
    }
    public static int lengthOfMonth(int year, int month)
    {
        boolean leap = false;
        if (year%4==0)
        {
            if(year%100==0)
            {
               if(year%400==0)
                   leap=true;
               else
                   leap=false;
            }
            else
                leap=false;
        }
        if (month == 4||month == 6||month == 9|| month==11)
        {
            return 30;
        }
        else if(month==2&&leap==true)
        {
          return 29;
        }
        else if(month==2&&leap==false)
            return 28;
        else
            {
                return 31;
            }
    }
    public static int lengthOfMonth(String year, String month)
    {
        int intYear = Integer.parseInt(year);
        boolean leap = false;
        if (intYear%4==0)
        {
            if(intYear%100==0)
            {
                if(intYear%400==0)
                    leap=true;
                else
                    leap=false;
            }
            else
                leap=false;
        }
        switch(month) {
            case "January":
                month = "1";
                break;
            case "February":
                month = "2";
                break;
            case "March":
                month = "3";
                break;
            case "April":
                month = "4";
                break;
            case "May":
                month = "5";
                break;
            case "June":
                month = "6";
                break;
            case "July":
                month = "7";
                break;
            case "August":
                month = "8";
                break;
            case "September":
                month = "9";
                break;
            case "October":
                month = "10";
                break;
            case "November":
                month = "11";
                break;
            case "December":
                month = "12";
                break;
        }
        int intMonth =Integer.parseInt(month);

        if (intMonth == 4||intMonth == 6||intMonth == 9|| intMonth==11)
        {
            return 30;
        }
        else if(intMonth==2&&leap==true)
        {
            return 29;
        }
        else if(intMonth==2&&leap==false)
            return 28;
        else
        {
            return 31;
        }
    }
    public static boolean checkPalindrome(String s)
    {
        boolean isPalindrome=false;
        String original = s;
        String reverse = "";
        for(int i=original.length()-1;i>=0;i--)
        {
            reverse=reverse+original.charAt(i);
        }
        if(original.equals(reverse))
            isPalindrome=true;
        return isPalindrome;
    }
    public static String myReverse(String s)
    {
        String original=s;
        String reverse="";
        for(int i=original.length()-1;i>=0;i--)
        {
            reverse=reverse+original.charAt(i);
        }
        return original+reverse;
    }
   // public static void primeList(int N) {}
    public static boolean isPerfect(int N)
    {
       int sum=0;
       boolean perNum;
       for (int i=1;i<N;i++)
       {
           if(N%i==0)
           {
               sum=sum+i;
           }
       }
       if (sum==N)
           perNum=true;
       else
           perNum=false;
       return perNum;
    }
    public static String myLuckyNumber(String N)
    {
        int[] sums = new int[N.length()];
        int lucky = 0;
        for (int i = 0; i < N.length(); i++)
        {
            sums[i] = Character.getNumericValue(N.charAt(i));
        }
        for (int j = 0; j < sums.length; j++)
        {
            lucky = lucky + sums[j];
        }
        if (lucky < 10)
        {
            String finalLucky = Integer.toString((lucky));
            return finalLucky;
        }
        else
            {
            String luckyString = Integer.toString(lucky);
            return myLuckyNumber(luckyString);
        }
    }
    public static boolean legalPin(String PIN)
    {
        int pinCount = 0;
        boolean strongPin = false;
        if (PIN.length()<8)
           return strongPin;
        else
           if(PIN.matches(".*[A-Z].*"))
               pinCount++;
            if(PIN.matches(".*[a-z].*"))
                pinCount++;
            if (PIN.matches("(.*[0-9].*)"))
                pinCount++;
            if(PIN.matches("(.*[,~,!,@,#,$,%,^,&,*,(,),-,_,=,+,[,{,],},|,;,:,<,>,/,?].*$)"))
                pinCount++;
            if (pinCount>=3)
                strongPin = true;
            return strongPin;
    }
    public static String reverse(String s)
    {
        String original=s;
        String reverse="";
        for(int i=original.length()-1;i>=0;i--)
        {
            reverse=reverse+original.charAt(i);
        }
        return reverse;
    }
    /*public static String myReplace(int P, String X, String Y, String Z)
    {

    }*/
}

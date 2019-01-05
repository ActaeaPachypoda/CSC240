public class Registra
{
    public static void main(String args[]){
        Person a = new Person("Smith", 19);
        Person [] csc240 = {new Person("Kathy", 18),
                new Person("Martin", 21), new Person("Smith", 19), a};
        System.out.println("The person newly registed this class: "+a);
        System.out.println("--------join in the class-----------");
        for(int i = 0; i<csc240.length; i++){
            System.out.println("The person already in class: "+csc240[i]);

            if(a==csc240[i])
                System.out.println("They are the same person object.");
            else
                System.out.println("They are different people.");

            if(a.has_same_name(csc240[i]))
                System.out.println("They have the same name.");
            else
                System.out.println("They have different names.");

            if(a.has_same_age(csc240[i]))
                System.out.println("They have the same age.");
            else
                System.out.println("They have different ages.");

            if(a.has_same_name(csc240[i]) && a.has_same_age(csc240[i]))
                System.out.println("Personal information is the same (equal).");
            else
                System.out.println("They are different people.");

            if(a.is_younger_than(csc240[i]))
                System.out.println("The new person is younger than student "+ i
                        + "in class (" + csc240[i]);
            else if (a.is_older_than(csc240[i]))
                System.out.println("The new person is older than student "+ i
                        + "in class (" + csc240[i]);
            else
                System.out.println("The new person has the same age as student "+ i
                        + "in class (" + csc240[i]);
            System.out.println("----- end of the check of one person -----\n");
        }
    }
}


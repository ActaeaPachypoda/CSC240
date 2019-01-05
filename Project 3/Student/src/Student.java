/**
 * Created by Sarah on 4/15/18
 */
public abstract class Student{
    private int [] weight = null;
    private double gpa;
    String id;

    public Student(String name, int tw, int qw, int aw){
        weight = new int [3];
        weight[0] = tw;
        weight[1] = qw;
        weight[2] = aw;
        id = name;
    }

    public abstract String toString();

    public double get_gpa(){return gpa;}
    public String get_name(){return id;}

    /**This method brings in an array of values representing the average scores on tests, quizzes and assignments
     * and the weight for each variable and uses them to calculate the Student GPA.
     * @param score - an array of values representing the average scores on tests, quizzes and assignments
     */
    public void letter_grading(double [] score){
        double total = 0.0;
        for(int i = 0; i<weight.length; i++)
            total += score[i]/100.00*weight[i];
        if (total>=93) gpa = 4.0;          // A
        else if (total>=90) gpa = 3.7;     // A-
        else if (total>=87) gpa = 3.33;    // B+
        else if (total>=83) gpa = 2.0;     // B
        else if (total>=80) gpa = 2.7;     // B-
        else if (total>=77) gpa = 2.3;     // C+
        else if (total>=73) gpa = 2.0;     // C
        else if (total>=70) gpa = 1.7;     // c-
        else if (total>=67) gpa = 1.3;     // D+
        else if (total>=63) gpa = 1.0;     // D
        else if (total>=60) gpa = -0.7;     // D-
        else gpa = 0;                       // F
    }
}

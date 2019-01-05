import java.util.Arrays;

public class Records extends Student{
    private int [] test = null;
    private int [] quiz = null;
    private int [] assignment = null;

    /** Constructor for the Records class, it takes in the name of the class the number of tests, quizzes,
     *  and assignments given as well as the grade weights associated with each.
     *
     * @param name - This is the parameter for the Id designation
     * @param tn - the number of tests
     * @param qn - the number of quizzes
     * @param an - the number of assignments
     * @param tw - the test weight
     * @param qw - the quiz weight
     * @param aw - the assignment weight
     */
    public Records (String name, int tn, int qn, int an, int tw, int qw, int aw)
    {
        super(name, tw, qw, aw);
        test = new int [tn];
        quiz = new int [qn];
        assignment = new int [an];
    }

    /** This method takes in the test array from the Records object and averages the values together
     *  for use in calculating the GPA.
     * @return returns the average of the all the tests given
     */
    public double get_test() {
        int sum = 0;
        if (test == null || test.length ==0)
            return 0.0;
        else
            for (int i=0; i< test.length; i++)
            {
                sum = sum + test[i];
            }
            double testAverage = sum/test.length;
            return testAverage;
    }

    /** This method takes in the values in the test array and assigns it to the test variable in the
     *  Records object.
     * @param test an array of values representing a Students score on the tests given.
     */
    public void set_test(int[] test) {
        this.test = test;
    }

    /** This method takes in the quiz array from the Records object and averages the values together
     *  for use in calculating the GPA.
     * @return returns the average of the all the quizzes given
     */
    public double get_quiz() {
        int sum = 0;
        if (quiz == null|| quiz.length==0)
            return 0.0;
        else
            for (int i=0; i< quiz.length; i++)
            {
                sum = sum + quiz[i];
            }
        double quizAverage = sum/(quiz.length);
        return quizAverage;
    }

    /** This method takes in the values in the quiz array and assigns it to the quiz variable in the
     * records object.
     * @param quiz an array of values representing a Students score on the quizzes given.
     */
    public void set_quiz(int[] quiz) {
        this.quiz = quiz;
    }

    /** This method takes in the assignment array from the Records object and averages the values together
     *  for use in calculating the GPA.
     * @return returns the average of the all the assignments given
     */
    public double get_assignment() {
        int sum = 0;
        if (assignment == null|| assignment.length==0)
            return 0.0;
        else
            for (int i=0; i< assignment.length; i++)
            {
                sum = sum + assignment[i];
            }
        double assignmentAverage = sum/(assignment.length);
        return assignmentAverage;
    }

    /** This method takes in the values in the assignment array and assigns it to the assignment variable in the
     * records object.
     * @param assignment - an array of values representing a Students score on the assignments given.
     */
    public void set_assignment(int[] assignment) {
        this.assignment = assignment;
    }

    /** This method takes in the averages for the test, quiz and assignment variables
     *  applies the letter_grading method from the Student superclass to access and assign the GPA
     *  variable.
     */
    public void grading()
    {
        double[] score = new double[3];
        score[0]=get_test();
        score[1]=get_quiz();
        score[2]=get_assignment();
        this.letter_grading(score);
    }

    public String toString() {
        String stringTest = "";
        String stringQuiz = "";
        String stringAssignment = "";
        if (test.length>0)
            stringTest = "\nTest score:"+ Arrays.toString(test);
        if (quiz.length>0)
            stringQuiz = "\nQuiz score:" + Arrays.toString(quiz);
        if (assignment.length>0)
            stringAssignment = "\nAssignment score" + Arrays.toString(assignment);

        return get_name() + stringTest + stringQuiz + stringAssignment
                + "\nGPA: " + get_gpa();
    }
}


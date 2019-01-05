import java.util.Arrays;

public class TestScores
{
    private int lowGrade;
    private int midGrade;
    private int highGrade;

    private int []gradeArray = null;

    public TestScores(int lowGrade, int midGrade, int highGrade)
    {
        this.lowGrade = lowGrade;
        this.midGrade = midGrade;
        this.highGrade = highGrade;
    }

    public TestScores(int[] gradeArray)
    {
        Arrays.sort(gradeArray);
        this.gradeArray = gradeArray;
        this.lowGrade=this.gradeArray[0];
        this.midGrade=this.gradeArray[1];
        this.highGrade=this.gradeArray[2];
    }
    public double getAvg()
    {
        int gradeTotal = this.lowGrade + this.midGrade + this.highGrade;
        double average = gradeTotal/3;
        return average;
    }
    public String toString()
    {
        return String.valueOf(getAvg());
    }
    public int compareTo(TestScores x)
    {
        if (this.getAvg() == x.getAvg())
            return 0;
        else if (this.getAvg() > x.getAvg())
            return 1;
        else if (this.getAvg() <  x.getAvg())
            return -1;
        else
            return 0;
    }
}
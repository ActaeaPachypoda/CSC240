/**
 * Created by Sarah Shaw on 4/15/18
 */
import javax.swing.JOptionPane;
import java.io.*;
import java.util.*;

public class Test{
    public static void main(String [] args){
        Records [] t = {
                new Records("CSC240", 2, 4, 3, 60, 10, 30),
                // 2 tests, 4 quizzes, and 3 assignments
                new Records("CSC321", 1, 3, 3, 25, 15, 60),
                // 1 test, 3 quizzes, and 3 assignments
                new Records("CSC115", 3, 0, 3, 60, 0, 40)};
        // 3 tests, 0 quiz, and 3 assignments

        String filename =
                JOptionPane.showInputDialog("Enter the file name: ");
        File inputFile = new File (filename);
        try {
            Scanner input = new Scanner(inputFile);
            String val;
            while(input.hasNext()){
                val = input.nextLine();
                String [] data = val.split(" ");

                int index = Integer.parseInt(data[0]);
                char opt = data[1].toLowerCase().charAt(0);
                int [] s = new int[data.length-2];
                for(int i = 0; i<s.length; i++)
                    s[i] = Integer.parseInt(data[i+2]);


                switch(opt){
                    case 't':
                        t[index].set_test(s);
                        break;
                    case 'q':
                        t[index].set_quiz(s);
                        break;
                    case 'a':
                        t[index].set_assignment(s);
                        break;
                }
            }
            input.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("file reading fails.");
        }

        for(int i = 0; i<t.length;  i++){
            Records tmp = t[i];
            tmp.grading();
            System.out.println(tmp);
        }
    }
}

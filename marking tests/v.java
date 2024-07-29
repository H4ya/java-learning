import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String student = in.nextLine();
        int questionAmount = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        int result=0,total=0;
        for (int i = 0; i < questionAmount; i++) {
            String question = in.nextLine();
            if(question.contains("+")){
                result = (question.charAt(0)-'0') + (question.charAt(4)-'0');
                if (result == (question.charAt(question.length()-1))-'0' ) total++;
            }
            else if (question.contains("-")){
                result = (question.charAt(0)-'0') - (question.charAt(4)-'0');
                if (result == (question.charAt(question.length()-1))-'0' ) total++;
            }
            else if (question.contains("x")){
                result = (question.charAt(0)-'0') * (question.charAt(4)-'0');
                if (result == (question.charAt(question.length()-1))-'0' ) total++;
            }
            else if (question.contains("/")){
                result = (question.charAt(0)-'0') / (question.charAt(4)-'0');
                if (result == (question.charAt(question.length()-1))-'0' ) total++;
            }
            
        }System.out.print(student+" got "+total+" / "+questionAmount);

    }
}
/*
ain't workin with numbers higher that 9
gotta fix it one day
Smat
3
52 + 28 = 80
36 / 4 = 9
57 - 13 = 44 */
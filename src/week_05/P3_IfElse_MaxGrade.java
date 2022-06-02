package week_05;

/*
The coder tries to implement a logic for printing the right grade. Max grade is assumed to be 100.
If the grade is greater than or equals to 90 output excellent
If the grade is greater than or equals to 70 and smaller than 90 output good
If the grade is greater than or equals to 60 and smaller than 70 output pass
If the grade is smaller than 60 output fail
 */
public class P3_IfElse_MaxGrade {
    public static void main(String[] args) {
        int grade = 80;
        String result = "";
        if (grade <= 100 && grade >= 0) {
            if (grade >= 90) {
                result = "excellent";
            } else if (grade >= 70) {
                result = "good";
            } else if (grade >= 60) {
                result = "pass";
            } else {
                result = "fail";
            }
        } else {
            result = "invalid input";
        }
        System.out.println(result);

    }
}

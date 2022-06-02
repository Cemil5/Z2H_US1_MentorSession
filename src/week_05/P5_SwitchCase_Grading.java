package week_05;

/*
I want to print only "Excellent" if grade is 'A', "Good" if grade is 'B', "Can be improved!"
if grade is 'C', for any other grades "No comment".
But this code prints "Excellent", "Good", "Can be improved!" together for grade 'A'
 */
public class P5_SwitchCase_Grading {
    public static void main(String[] args) {
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
            case 'B':
                System.out.println("Good");
            case 'C':
                System.out.println("Can be improved!");
            default:
                System.out.println("No comment");
        }

    }
}

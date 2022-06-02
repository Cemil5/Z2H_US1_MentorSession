package week_07;

public class PrintStarsNumbers {
    public static void main(String[] args) {
//        madiyar();
//        dilara();
//        gadir();
//        jawid();
//        natalie();
//        gadirAlternativeSolution();
        yasin();
    }

    /*
5 4 3 2 1
5 4 3 2
5 4 3
5 4
5
  */
    static void madiyar() {
        int n = 5;
        int m = 1;

        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= m; j--) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
            m++;
        }
    }

    /*
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
     */
    static void dilara() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");  // " " added
            }
            System.out.println();

        }
    }

    /*
5 4 3 2 1
* 4 3 2 1
* * 3 2 1
* * * 2 1
* * * * 1
     */
    static void gadir() {        // I used 3 loops. Could not figure out with two loops
        int a = 0;
        for (int i = 5; i > 0; i--) {
            for (int k = 0; k < a; k++) {
                System.out.print("* ");
            }
            a++;
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void gadirAlternativeSolution() {        // I used 3 loops. Could not figure out with two loops
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j <= i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print(6 - j + " ");
                }
            }
            System.out.println();
        }
    }

    /*
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1
     */
    static void jawid() {
        int firstNumber = 5;
        int lastNumber = 1;

        for (int i = firstNumber; i >= 1; i--) {
            for (int j = firstNumber; j >= lastNumber; j--) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
            firstNumber--;
        }
    }
    /*
     *  *  *  *  *
     *  *  *  *
     *  *  *
     *  *
     *
     */

    static void natalie() {
        for (int i = 0; i < 5; i++) {

            for (int j = 5; j > i; j--) {

                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------");

        for (int i = 5; i > 0; i--) {

            for (int j = 0; i > j; j++) {

                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    static void yasin(){
        int rows = 5;
        for (int i = rows ; i >=1 ; i-- ) {
            for (int j = 1 ; j <= rows - i; j++ )
            {
                System.out.print(" ");
            }
            for (int k = i ; k >= 1 ; k-- )
            {
                System.out.print(" " + k);
            }
            System.out.println("");
        }
    }

}

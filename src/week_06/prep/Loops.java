package week_06.prep;

public class Loops {
    public static void main(String[] args) {

        int a = 1;
        System.out.println("while : ");
        while (a < 5) {
            System.out.print(a + " ");
            a++;
        }

        System.out.println("\nfor :");
        for (a = 1; a < 5; a++) {
            System.out.print(a + " ");
        }

        System.out.println("\ndo while : ");
        a = 1;
        do {
            System.out.print(a + " ");
            a++;
        } while (a < 5);
    }

}

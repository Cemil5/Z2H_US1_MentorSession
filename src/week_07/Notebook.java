package week_07;

public class Notebook {
    public static void main(String[] args) {
        solution2();
    }

    static void solution1(){
        String weekPrefix = "Week: ";
        String dayPrefix = "\tDay: ";

        //outer loop will iterate over weeks
        for (int weekCounter = 1; weekCounter < 5; weekCounter++) {
            System.out.println(weekPrefix + weekCounter);

            //inner loop will iterate over days of week
            // we need to start from 1 for each week
            //that's why we are assigning 1 to dayCounter for each week
            for (int dayCounter = 1; dayCounter < 8; dayCounter++) {
                System.out.println(dayPrefix + dayCounter);
            }
        }
    }

    static void solution2(){
        String weekPrefix = "Week: ";
        String dayPrefix = "   Day: ";

        int weekCounter = 1;
        while (weekCounter <= 4){
            System.out.println(weekPrefix + weekCounter);
            int dayCounter = 1;
            do{
                System.out.println(dayPrefix + dayCounter);
                dayCounter++;
            }while (dayCounter <= 7);
            weekCounter++;
        }
    }


        static void solution3(){
        for (int i = 1; i <4 ; i++) {
            System.out.println("Week "+ i);
            for (int j = 1; j < 8 ; j++) {
                System.out.println("\tDay " + j);
            }
        }
    }
}

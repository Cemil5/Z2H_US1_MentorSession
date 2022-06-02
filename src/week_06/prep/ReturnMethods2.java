package week_06.prep;

public class ReturnMethods2 {


    public static void main(String[] args) {

        int total =   addition1(10, 20);
        System.out.println(total);

        System.out.println(addition2(10, 20));
    }

    public static int addition1(int n1, int n2){
        int result = n1 + n2;
        return result;
    }

    public static int addition2(int n1, int n2){
        return n1 + n2;
    }

}

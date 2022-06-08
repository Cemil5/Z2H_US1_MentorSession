package week_08;

/*
 We have a fox group consists of 4 foxes. Unfortunately one of them stole an egg from chicken barn.
 Luckily guard rooster have some info to identify the guilty fox.
 Sheriff Dog got the info from the rooster. Sheriff Dog announced that;
 thief fox had a black coat, a torch and 3 bags.
 Find the suspect foxes, if a fox is cleared of charges write that also
*/
public class ThiefFox {

    public static void main(String[] args) {
        boolean fox1WearsCoat = true;
        boolean fox2WearsCoat = true;
        boolean fox3WearsCoat = true;
        boolean fox4WearsCoat = false;

        boolean fox1HasATorch = true;
        boolean fox2HasATorch = true;
        boolean fox3HasATorch = true;
        boolean fox4HasATorch = true;

        String fox1CoatColor = "BLACK";
        String fox2CoatColor = "BLACK";
        String fox3CoatColor = "BLACK";
        String fox4CoatColor = "GRAY";

        int fox1BagCount = 0;
        int fox2BagCount = 2;
        int fox3BagCount = 3;
        int fox4BagCount = 3;

        if (fox1WearsCoat && fox1CoatColor.equals("BLACK") && fox1HasATorch && fox1BagCount == 3) {
            System.out.println("\uD83E\uDD8A Fox1 is one of suspects! \uD83E\uDD14");
        }else {
            System.out.println("\uD83E\uDD8A Fox1 cleared of charges!");
        }

        if (fox2WearsCoat && fox2CoatColor.equals("BLACK") && fox2HasATorch && fox2BagCount == 3) {
            System.out.println("\uD83E\uDD8A Fox2 is one of suspects! \uD83E\uDD14");
        }else {
            System.out.println("\uD83E\uDD8A Fox2 cleared of charges!");
        }

        if (fox3WearsCoat && fox3CoatColor.equals("BLACK") && fox3HasATorch && fox3BagCount == 3) {
            System.out.println("\uD83E\uDD8A Fox3 is one of suspects! \uD83E\uDD14");
        }else {
            System.out.println("\uD83E\uDD8A Fox3 cleared of charges!");
        }

        if (fox4WearsCoat && fox4CoatColor.equals("BLACK") && fox4HasATorch && fox4BagCount == 3) {
            System.out.println("\uD83E\uDD8A Fox4 is one of suspects! \uD83E\uDD14");
        }else {
            System.out.println("\uD83E\uDD8A Fox4 cleared of charges!");
        }



    }
}

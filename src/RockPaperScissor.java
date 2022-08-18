import java.util.Random;

public class RockPaperScissor {

    public static void main(String[] args) {
        int i = 0;

        while (i < 10);
        {

            Random rand = new Random();
            int rand_int = rand.nextInt(3) + 1;

            if (rand_int == 1) {
                System.out.println("Rock");
            } else if (rand_int == 2) {
                System.out.println("Paper");
            } else {
                System.out.println("Scissors");
            }
            i++;


        }

    }
}

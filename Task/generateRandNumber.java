package Task;

import java.util.Random;

public class generateRandNumber {
    public static void main(String[] args) {
        //?One way
        // for (int i = 0; i <= 20; i++) {
        //     double rand = Math.random()*20;
        //     // System.out.println(Math.round(rand));
        // }

        //?way Two
        Random rand = new Random();

        int randomNumber = rand.nextInt(100);

        System.out.println(randomNumber);
    }
}

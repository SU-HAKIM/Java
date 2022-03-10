package object;

import java.util.Random;

public class Util{
    int rand() {
        Random rand=new Random();
        int randomNumber = rand.nextInt(100);

        return randomNumber;
    }
}
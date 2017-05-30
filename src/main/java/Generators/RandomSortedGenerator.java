package Generators;

import java.util.Random;

public class RandomSortedGenerator implements Generator {
    private Random r = new Random();

    public int[] generate(int size) {
        int[] randomArray = new int[size];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = r.nextInt() % 1000;
        }
        return randomArray;
    }
}

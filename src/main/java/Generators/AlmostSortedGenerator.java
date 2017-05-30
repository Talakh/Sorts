package Generators;

public class AlmostSortedGenerator implements Generator {
    public int[] generate(int size) {
        int[] almostSortedArray = new int[size];

        for (int i = 0; i < almostSortedArray.length; i++) {
            almostSortedArray[i] = i;
        }

        almostSortedArray[almostSortedArray.length - 1] = -1;
        return almostSortedArray;
    }
}
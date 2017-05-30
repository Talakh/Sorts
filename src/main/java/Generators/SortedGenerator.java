package Generators;

public class SortedGenerator implements Generator {

    public int[] generate(int size) {
        int[] sortedArray = new int[size];

        for (int i = 0; i < sortedArray.length; i++) {
            sortedArray[i] = i;
        }
        return sortedArray;
    }
}
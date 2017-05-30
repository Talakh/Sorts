package Generators;

public class InverseSortedGenerator implements Generator {
    public int[] generate(int size) {
        int[] inverseArray = new int[size];

        for (int i = 0; i < inverseArray.length; i++) {
            inverseArray[i] = inverseArray.length - i;
        }
        return inverseArray;
    }
}
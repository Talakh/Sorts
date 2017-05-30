package Sorters;

public class InsertionSorter implements Sorter {
    public int[] sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int prevent = i - 1;
            while (prevent >= 0 && array[prevent] > current) {
                array[prevent + 1] = array[prevent];
                prevent--;
            }
            array[prevent + 1] = current;
        }
        return array;
    }
}
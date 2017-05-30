package Sorters;

import java.util.Arrays;

public class DefaultSorter implements Sorter {
    public int[] sort(int[] array) {
        Arrays.sort(array);
        return array;
    }
}

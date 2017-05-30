package Sorters;

public class ShellSorter implements Sorter {
    public int[] sort(int[] list) {
        int inner, outer;
        int temp;

        int h = 1;
        while (h <= list.length / 3) {
            h = h * 3 + 1;
        }
        while (h > 0) {
            for (outer = h; outer < list.length; outer++) {
                temp = list[outer];
                inner = outer;

                while (inner > h - 1 && list[inner - h] >= temp) {
                    list[inner] = list[inner - h];
                    inner -= h;
                }
                list[inner] = temp;
            }
            h = (h - 1) / 3;
        }
        return list;
    }
}
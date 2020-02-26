package com.charith.general.Java8;

public class SolutionBinarySearch {

    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{1, 3, 5, 7}, 1));

        System.out.println(binarySearch(new int[]{5, 7, 9}, 2));

        System.out.println(binarySearch(new int[]{5, 7, 9}, 8));

        System.out.println(binarySearch(new int[]{5, 7, 9}, 6));
    }

    private static int binarySearch(int[] array, int key) {
        return binarySearch(array, 0, array.length, key);
    }

    private static int binarySearch(int[] array, int fromIndex, int toIndex, int key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (high + low) >>> 1;
            int midValue = array[mid];

            if (key < midValue) {
                high = mid - 1;
            } else if (key > midValue) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -(low + 1);
    }

}

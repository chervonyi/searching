package com.general;

public class BinarySearch {
    /**
     * Returns true or false if required element contains in the array
     * @param array vault of elements
     * @param el required element
     * @return True if el was found.
     *         False if el was not found.
     */
    public boolean contains(int[] array, int el) { return getPosition(array, el) != -1; }

    /**
     * Returns index of position required element
     * @param array vault of elements
     * @param el required element
     * @return position of required element. Else returns -1
     */
    public int getPosition (int[] array, int el) {
        return getPosition(array, 0, array.length, el);
    }

    private int getPosition(int[] array, int start, int end, int el) {
        // Check if subarray too small for recursion
        if ((end - start) < 2) {
            if (array[start] == el)
                return start;
            return -1;
        }

        // Get middle element and check it
        int mid = ((end - 1 - start) / 2) + start;
        if (array[mid] == el) {
            return mid;
        }

        // Choose appropriate half (Left or right) (+Recursion)
        if (el > array[mid]) {
            // Use right half
            return getPosition(array, mid + 1, end, el);
        } else {
            // Use left half
            return getPosition(array, start, mid, el);
        }
    }
}

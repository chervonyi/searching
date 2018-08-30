package com.general;

public class LinearSearch {
    /**
     * Returns true or false if required element contains in the array
     * @param array vault of elements
     * @param el required element
     * @return True if el was found.
     *         False if el was not found.
     */
    public boolean contains(int[] array, int el) {
        return getPosition(array, el) != -1;
    }

    /**
     * Returns index of position required element
     * @param array vault of elements
     * @param el required element
     * @return position of required element. Else returns -1
     */
    public int getPosition(int[] array, int el) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == el) {
                return i;
            }
        }

        return -1;
    }
}

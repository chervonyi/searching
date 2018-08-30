package com.general;

public class Main {

    public static void main(String[] args) {

        //int[] notSorted = new int[] {12, 4, 6, 17, 19, 1, 3, 15, 9, 13};
        int[] sorted = new int[] {1, 2, 3, 4, 6, 9, 11, 13, 14, 15, 19, 20};
        LinearSearch linearSearch = new LinearSearch();
        BinarySearch binarySearch = new BinarySearch();

        //System.out.println(linearSearch.contains(notSorted, 9));
        System.out.println(binarySearch.getPosition(sorted, 21));

    }
}

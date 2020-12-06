package ru.geekbrains.lesson_one;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9};
        int[] arr3 = Arrays.copyOf(arr1, arr1.length);              //пример создания копии массива
        int[] arr4 = Arrays.copyOfRange(arr3,3,arr3.length);  //коприровании от индекса 3 до конца массива
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));

    }
}

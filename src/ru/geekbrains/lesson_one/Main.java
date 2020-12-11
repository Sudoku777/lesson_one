package ru.geekbrains.lesson_one;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for(int i=0;i<10;i++){
            if(i>5)
                break;
            System.out.println("i= "+i);
        }
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9};
        int[] arr3 = Arrays.copyOf(arr1, arr1.length);              //пример создания копии массива
        int[] arr4 = Arrays.copyOfRange(arr3,3,arr3.length);  //коприровании от индекса 3 до конца массива
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));

        int a=0,b =10,c=0;
        if(a!=0){
            System.out.println("a не равно 0");
            c=b/a;
            System.out.println("a / b ="+c);
        }else{
            System.out.println("a = 0. Делить на 0 нельзя\n");
        }
        int awg=100;
        if(awg==100){
            System.out.println("Молодец\n");
        }
        int mark= 50;
        if ( mark<60){
            mark += (mark/10);
            System.out.println("mark "+mark+"\n");
        }
        Scanner scan = new Scanner(System.in);
        System.out.print("Weight: ");
        double weight = scan.nextDouble();
        System.out.println("New weight: " + weight / 100 * 16);
    }

}

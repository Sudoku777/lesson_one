package ru.geekbrains.lesson_two;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        scanner.nextInt();
        for(int a=0;a<10;a++){
            System.out.print("1");
            for(int b= 0; b<10;b++)
                System.out.print("0");
            if(a<=10){
                System.out.println("Bad choose");
            }else{
                System.out.println("HHHmmmm noooo )) ");
            }
        }
    }
}

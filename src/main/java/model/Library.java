/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Bravo
 */
public class Library {

    private final Scanner scanner = new Scanner(System.in);

    public int getInt(String prompt, int m, int n) {
        int a = -1;
        while (true) {
            System.out.print(prompt + ": ");
            try {
                String s = scanner.nextLine();
                a = Integer.parseInt(s);
                if (a >= m && a <= n) {
                    break;
                } else {
                    System.err.println("Please enter a number between " + m + " and " + n);
                }
            } catch (Exception e) {
                System.err.println("Please enter a valid number.");
            }
        }
        return a;
    }

    public int[] createArray(int size_Array) {
        int[] array = new int[size_Array];
        Random rd = new Random();
        for (int i = 0; i < size_Array; i++) {
            array[i] = rd.nextInt(100);
        }
        return array;
    }

    public void display(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.println("");
    }
}

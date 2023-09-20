/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Bravo
 */
public class Menu<T> {

    private String title;
    private ArrayList<T> mChon;
    private final Scanner scanner = new Scanner(System.in);

    public Menu(String title, T[] options) {
        this.title = title;
        mChon = new ArrayList<>();
        for (T option : options) {
            mChon.add(option);
        }
    }

    public void display() {
        System.out.println(title);
        System.out.println("--------------------------------");
        for (int i = 0; i < mChon.size(); i++) {
            System.out.println((i + 1) + ". " + mChon.get(i));
        }
        System.out.println("--------------------------------");
    }

    public int getSelected() {
        display();
        int choice;
        while (true) {
            System.out.print("Enter your choice: ");
            try {
                choice = Integer.parseInt(scanner.nextLine().trim());
                if (choice >= 1 && choice <= mChon.size()) {
                    break;
                } else {
                    System.err.println("Invalid choice. Please select a valid option.");
                }
            } catch (NumberFormatException e) {
                System.err.println("Invalid input. Please enter a number.");
            }
        }
        return choice;
    }
}

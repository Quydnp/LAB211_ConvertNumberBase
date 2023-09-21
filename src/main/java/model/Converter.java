/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Scanner;

/**
 *
 * @author Bravo
 */
public class Converter {

    private final Scanner in = new Scanner(System.in);
    private final Library l = new Library();

    public String checkInputBinary() {
        System.out.print("Enter number binary: ");
        String result;
        while (true) {
            result = in.nextLine().trim();
            if (result.matches("[0-1]*")) {
                return result;
            }
            System.err.println("Must be enter 0 or 1");
            System.out.print("Enter again: ");
        }
    }

    public String checkInputDecimal() {
        System.out.print("Enter number decimal: ");
        String result;
        while (true) {
            result = in.nextLine().trim();
            if (result.matches("[0-9]*")) {
                return result;
            }
            System.err.println("Must be enter 0-9");
            System.out.print("Enter again: ");
        }
    }

    public String checkInputHexaDecimal() {
        System.out.print("Enter number hexadecimal: ");
        String result;
        while (true) {
            result = in.nextLine().trim();
            if (result.matches("[0-9A-F]*")) {
                return result;
            }
            System.err.println("Must be enter 0-9 A-F");
            System.out.print("Enter again: ");
        }
    }

    public void convertFromBinary(String binary, int base) {
        int decimal = Integer.parseInt(binary, 2);
        if (base == 10) {
            System.out.println("Decimal: " + decimal);
        } else if (base == 16) {
            String hexa = Integer.toHexString(decimal).toUpperCase();
            System.out.println("Hexadecimal: " + hexa);
        }
    }

    public void convertFromDecimal(String decimal, int base) {
        int dec = Integer.parseInt(decimal);
        if (base == 2) {
            String binary = Integer.toBinaryString(dec);
            System.out.println("Binary: " + binary);
        } else if (base == 16) {
            String hexa = Integer.toHexString(dec).toUpperCase();
            System.out.println("Hexadecimal: " + hexa);
        }
    }

    public void convertFromHexa(String hexa, int base) {
        int decimal = Integer.parseInt(hexa, 16);
        if (base == 10) {
            System.out.println("Decimal: " + decimal);
        } else if (base == 2) {
            String binary = Integer.toBinaryString(decimal);
            System.out.println("Binary: " + binary);
        }
    }

    public void workWithArrays(Element element) {
        int[] array = element.getArray();
        System.out.println("Array Size: " + element.getSize_array());
        System.out.print("Array Elements: ");
        l.display(array);
    }
}

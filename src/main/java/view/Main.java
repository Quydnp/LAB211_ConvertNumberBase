package view;

import model.Converter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Bravo
 */
public class Main {

    public static void main(String[] args) {
        Menu<String> menu = new Menu<>("Main Menu", new String[]{
            "Convert From Binary",
            "Convert From Decimal",
            "Convert From Hexa",
            "Exit"});

        Converter converter = new Converter();

        while (true) {
            int choice = menu.getSelected();
            switch (choice) {
                case 1:
                    String binary = converter.checkInputBinary();
                    converter.convertFromBinary(binary);
                    break;
                case 2:
                    String decimal = converter.checkInputDecimal();
                    converter.convertFromDecimal(decimal);
                    break;
                case 3:
                    String hexa = converter.checkInputHexaDecimal();
                    converter.convertFromHexa(hexa);
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}

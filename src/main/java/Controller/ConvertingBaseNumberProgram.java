/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.Menu;
import model.Converter;

/**
 *
 * @author HI
 */
public class ConvertingBaseNumberProgram extends Menu<String> {
    Converter converter = new Converter();
    Menu menuBin = new Menu("Convert Binary Number", new String[]{
            "Convert From Binary to Decimal",
            "Convert From Binary to Hexadecimal"}) {
        @Override
        public void execute(int choice) {
            switch (choice) {
                case 1:
                    String binary = converter.checkInputBinary();
                    converter.convertFromBinary(binary, 10);
                    break;
                case 2:
                    binary = converter.checkInputBinary();
                    converter.convertFromBinary(binary, 16);
                    break;
            }
        }
    };
    Menu menuDec = new Menu("Convert Decimal Number", new String[]{
            "Convert From Decimal to Binary",
            "Convert From Decimal to Hexadecimal"}) {
        @Override
        public void execute(int choice) {
            switch (choice) {
                case 1:
                    String decimal = converter.checkInputDecimal();
                    converter.convertFromDecimal(decimal, 2);
                    break;
                case 2:
                    decimal = converter.checkInputDecimal();
                    converter.convertFromDecimal(decimal, 16);
                    break;
            }
        }
    };
    Menu menuHex = new Menu("Convert Hexadecimal Number", new String[]{
            "Convert From Hexadecimal to Decimal",
            "Convert From Hexadecimal to Binary"}) {
        @Override
        public void execute(int choice) {
            switch (choice) {
                case 1:
                    String hexa = converter.checkInputHexaDecimal();
                    converter.convertFromHexa(hexa, 10);
                    break;
                case 2:
                    hexa = converter.checkInputHexaDecimal();
                    converter.convertFromHexa(hexa, 2);
                    break;
            }
        }
    };

    public ConvertingBaseNumberProgram() {
        super("CONVERTING NUMBER BASE PROGRAM", new String[]{
            "Convert From Binary",
            "Convert From Decimal",
            "Convert From Hexa",
            "Exit"});
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                menuBin.run();
                break;
            case 2:
                menuDec.run();
                break;
            case 3:
                menuHex.run();
                break;
            case 4:
                System.exit(0);
                break;
        }
    }
}

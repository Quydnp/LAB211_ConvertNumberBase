/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Bravo
 */
public class Element {

    private int size_array;
    private int[] array;

    public Element(int size_array) {
        this.size_array = size_array;
        this.array = new int[size_array];
    }

    public int getSize_array() {
        return size_array;
    }

    public void setSize_array(int size_array) {
        this.size_array = size_array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}

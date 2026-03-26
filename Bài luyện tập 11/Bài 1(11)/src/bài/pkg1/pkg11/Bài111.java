/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bài.pkg1.pkg11;

public class Bài111 {
    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Integer array:");
        printArray(intArray);
        
        String[] strArray = {"Hello", "Linh", "Tuấn", "Anh"};
        System.out.println("\nString array:");
        printArray(strArray);
    }
}
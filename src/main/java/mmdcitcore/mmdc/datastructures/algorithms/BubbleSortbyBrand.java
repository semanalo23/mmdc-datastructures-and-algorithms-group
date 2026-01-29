/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mmdcitcore.mmdc.datastructures.algorithms;

/**
 *
 * @author ASPIRE 7
 */
public class BubbleSortbyBrand {
    public static void bubbleSortByBrand(InventoryItem[] items){
        int n = items.length;
       
        for (int i = 0; i < n -1; i++){
            for (int j = 0; j < n - 1; j++){
                if (items[j].brand.compareToIgnoreCase(items[j + 1].brand) > 0){
                    //swap
                    InventoryItem temp = items[j];
                    items[j] = items [j + 1];
                    items[j + 1] = temp;
                }
            }
        }
    }
}

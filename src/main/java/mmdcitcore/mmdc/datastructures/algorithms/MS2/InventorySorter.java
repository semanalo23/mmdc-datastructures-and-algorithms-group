/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mmdcitcore.mmdc.datastructures.algorithms.MS2;

import java.util.ArrayList;

/**
 *
 * @author ASPIRE 7
 */
public class InventorySorter {
    // Merge Sort: algorithm of choice for MS2
    
   // this method splits the list into smaller stacks, sorts them, then combines them back.
    public static void mergeSorter(ArrayList<InventoryItem> list) {
        
        if (list.size() <= 1) 
            return;
        
        int mid = list.size() / 2;
        ArrayList<InventoryItem> left = new ArrayList<>(list.subList(0, mid));
        ArrayList<InventoryItem> right = new ArrayList<>(list.subList(mid, list.size()));
        
        mergeSorter(left);
        mergeSorter(right);
        
        merge(list, left, right);
    }
    
    //helper method to combine the two smaller stacks
    private static void merge(ArrayList<InventoryItem> list, ArrayList<InventoryItem> left, ArrayList<InventoryItem> right) {
        int i = 0, j = 0, k = 0;
        
        while (i < left.size() && j < right.size()) {
            if (left.get(i).brand.compareToIgnoreCase(right.get(j).brand) <= 0) {
                list.set(k++, left.get(i++));
                }
            else {
                list.set(k++, right.get(j++));
            }
            while (i < left.size()) list.set(k++, left.get(i++));
            while (j < right.size()) list.set(k++, right.get(j++));
        }
    }
}

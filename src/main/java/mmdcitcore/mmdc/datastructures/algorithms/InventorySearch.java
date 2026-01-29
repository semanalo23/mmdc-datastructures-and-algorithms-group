/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mmdcitcore.mmdc.datastructures.algorithms;

/**
 *
 * @author ASPIRE 7
 */
public class InventorySearch {
    public static InventoryItem searchByEntryNumber(InventoryLinkedList list, int entrNo){
        InventoryNode temp = list.getHead(); //getter from LinkedList class - head is encapsulated
           
            while(temp != null){
                if (temp.data.entrNo == entrNo){
                    return temp.data;
                }
                temp = temp.next;
            }
            return null;//not found
    }
    public static void searchByBrand(InventoryLinkedList list, String brand){
        InventoryNode temp = list.getHead();
        boolean found  = false;
        
        while (temp != null){
            if (temp.data.brand.equalsIgnoreCase(brand)){
                System.out.println(temp.data);
                found = true;
            }
            temp = temp.next;
        }
        if (!found){
            System.out.println("No items found for brand: " + brand);
        }
    }
}

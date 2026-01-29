/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mmdcitcore.mmdc.datastructures.algorithms;

/**
 *
 * @author ASPIRE 7
 */
public class MmdcDatastructuresAlgorithms {

    public static void main(String[] args) {
        InventoryLinkedList inventoryList = new InventoryLinkedList();
        
        //Add sample items
        InventoryItem item1  = new InventoryItem(1,"Honda", "CBR500R", "Sport/ 471cc", 389000, 12, "Available");
        InventoryItem item2 = new InventoryItem(2,"Yamaha", "MT-15", "Naked/ 155cc", 178000, 8, "Available");
        
        inventoryList.addStock(item1);
        inventoryList.addStock(item2);
        
        System.out.println("=== Inventory ===");
        inventoryList.displayInventory();
        
        System.out.println("\nDeleting EntrNo 1...");
        inventoryList.deleteStock(1);
        
        System.out.println("\n=== Inventory: After Deletion");
        inventoryList.displayInventory();
    }
}

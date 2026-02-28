/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mmdcitcore.mmdc.datastructures.algorithms.MS2;

import java.util.HashMap;

/**
 *
 * @author ASPIRE 7
 */
public class InventoryHashTable {
    
    // Hash Table: Think of this as a "filing cabinet". 
    // Each motorcycle is stored by its entry number for quick lookup.
    
    private HashMap<Integer, InventoryItem> inventoryTable = new HashMap<>();
    
    // Add a new motorcycle record
    public void insertItem(InventoryItem item) {
        inventoryTable.put(item.entrNo, item);
    }
    // Find a motorcycle by entry number
    public InventoryItem searchItem(int entrNo) { 
        return inventoryTable.get(entrNo);
    }
    // Remove a motorcycle by entry number
    public void deleteItem(int entrNo) { 
        inventoryTable.remove(entrNo);
    }
    
    // Get all records (used for reports and display)
    public Iterable<InventoryItem> getAllInventoryItems(){
        return inventoryTable.values();
    }
}

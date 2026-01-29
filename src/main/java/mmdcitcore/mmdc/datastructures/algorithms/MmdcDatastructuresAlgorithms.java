/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mmdcitcore.mmdc.datastructures.algorithms;

import java.util.List;
import java.util.Scanner;
import static mmdcitcore.mmdc.datastructures.algorithms.InventoryDisplay.displayArray;
import static mmdcitcore.mmdc.datastructures.algorithms.InventorySorterBubbleSort.bubbleSortByBrand;
import static mmdcitcore.mmdc.datastructures.algorithms.InventorySorterBubbleSort.bubbleSortByPrice;
import static mmdcitcore.mmdc.datastructures.algorithms.InventorySorterBubbleSort.bubbleSortbyQuantity;

/**
 *
 * @author ASPIRE 7
 */
//DEMO CONSOLE BASED INVENTORY MGMT SYSTEM
public class MmdcDatastructuresAlgorithms {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InventoryLinkedList inventoryList = new InventoryLinkedList();
        
        //Load CSV once at start
        List<InventoryItem> loadedItems = InventoryLoader.loadInventory("src/main/java/mmdcitcore/mmdc/datastructures/algorithms/MotorPH_Inventory_2025.csv");
        
        for (InventoryItem item : loadedItems){
            inventoryList.addStock(item);
        }
        int choice;
        do {
            System.out.println("\n=== Inventory Menu ===");
            System.out.println("1. Display Inventory (Linked List)");
            System.out.println("2. Convert to Array & Display");
            System.out.println("3. Sort by Brand");
            System.out.println("4. Sort by Price");
            System.out.println("5. Sort by Quantity");
            System.out.println("6. Delete Stock by Entry Number");
            System.out.println("7. Add New Stock");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            
            switch(choice){
                case 1:
                    inventoryList.displayInventory();
                    break;
                 
                case 2:
                    InventoryItem[] array = inventoryList.toArray();
                    displayArray(array);
                    break;
                
                case 3:
                    array = inventoryList.toArray();
                    bubbleSortByBrand(array);
                    displayArray(array);
                    break;
                    
                case 4:
                    array = inventoryList.toArray();
                    bubbleSortByPrice(array);
                    displayArray(array);
                    break;
                
                case 5:
                    array = inventoryList.toArray();
                    bubbleSortbyQuantity(array);
                    displayArray(array);
                    break;
                
                case 6:
                    System.out.println("Enter Entry Number to delete: ");
                    int entrNo = sc.nextInt();
                    inventoryList.deleteStock(entrNo);
                    break;
                    
                case 7:
                    System.out.print("Enter Entry Number: ");
                    entrNo = sc.nextInt();
                    sc.nextLine(); //consume newline
                    
                    System.out.print("Enter Brand: ");
                    String brand = sc.nextLine();
                    
                    System.out.print("Enter Model: ");
                    String model = sc.nextLine();
                    
                    System.out.print("Enter Details: ");
                    String details = sc.nextLine();
                    
                    System.out.print("Enter Unit Price: ");
                    double unitPrice = sc.nextDouble();
                    
                    System.out.print("Enter Stock Quantity: ");
                    int stockQty = sc.nextInt();
                    sc.nextLine(); // consume newline
                    
                    System.out.print("Enter Status: ");
                    String status = sc.nextLine();
                    
                    //Create a new inventory item object
                    InventoryItem newItem = new InventoryItem(entrNo, brand, model, details, unitPrice, stockQty, status);
                    inventoryList.addStock(newItem);
                    
                    System.out.println("New Stock added successfully.");
                    break;
                
                case 0:
                    System.out.println("Exiting...");
                    break;     
            }
        } while (choice != 0);
    }
}
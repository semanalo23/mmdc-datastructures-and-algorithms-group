/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mmdcitcore.mmdc.datastructures.algorithms.MS2;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASPIRE 7
 */
public class MS2mainprogram {
    
    public static void main(String[] args) throws Exception {
        // It loads the CSV file, then lets staff choose actions.
        
        InventoryHashTable hashTable = new InventoryHashTable();
        InventoryBST bst = new InventoryBST();
        
        // Load CSV file (skip header row)
        CSVReader reader = new CSVReader(new FileReader("src/main/java/mmdcitcore/mmdc/datastructures/algorithms/MS2/MotorPH_Inventory_2025_MS2.csv"));
            
        String[] inventoryParts;
        reader.readNext(); // skip header
           
            while ((inventoryParts = reader.readNext()) != null) {
            //creates the inventory object
            InventoryItem item = new InventoryItem(
                    Integer.parseInt(inventoryParts[0]),
                    inventoryParts[1], 
                    inventoryParts[2], 
                    inventoryParts[3],
                    Double.parseDouble(inventoryParts[4]), 
                    Integer.parseInt(inventoryParts[5]), 
                    inventoryParts[6]);
            
            hashTable.insertItem(item);
            bst.insertMotorcycle(item);
        }
        reader.close();
        
        //main selection program
        Scanner sc = new Scanner(System.in);
        int choice;
        
        do {
            // Menu options
            System.out.println("\nMenu:");
            System.out.println("1. Display Inventory");
            System.out.println("2. Add New Stock");
            System.out.println("3. Delete Stock");
            System.out.println("4. Search Inventory");
            System.out.println("0. Exit");
            
            //takes user choice and consumes new line
            choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice){
                
                case 1:
                    // Display inventory sorted by brand
                    ArrayList<InventoryItem> list = new ArrayList<>();
                    for (InventoryItem item : hashTable.getAllInventoryItems()) list.add(item);
                    InventorySorter.mergeSorter(list);
                    for (InventoryItem item : list) System.out.println(item);
                    break;
                    
                case 2:
                    // Add new motorcycle
                    System.out.print("Enter Entry Number: ");
                    int entryNo = sc.nextInt(); 
                    sc.nextLine();
                    System.out.print("Enter Brand: "); 
                    String brand = sc.nextLine();
                    System.out.print("Enter Model: "); 
                    String model = sc.nextLine();
                    System.out.print("Enter Details: "); 
                    String details = sc.nextLine();
                    System.out.print("Enter Unit Price: "); 
                    double price = sc.nextDouble();
                    System.out.print("Enter Stock Qty: "); 
                    int qty = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter Status: "); 
                    String status = sc.nextLine();
                    
                    //creates a new inventory item object
                    InventoryItem newItem = new InventoryItem(entryNo, brand, model, details, price, qty, status);
                    hashTable.insertItem(newItem);
                    bst.insertMotorcycle(newItem);
                    break;
                    
                case 3:
                    // Delete motorcycle by entry number
                    System.out.print("Enter Entry Number to delete: ");
                    int delEntryNo = sc.nextInt();
                    
                    InventoryItem record = hashTable.searchItem(delEntryNo);
                    if (record != null) {
                        hashTable.deleteItem(delEntryNo);
                        System.out.println("Record deleted.");
                    }
                    else {
                        System.out.println("Record not found.");
                    }
                    break;
                    
                case 4:
                    // Search options
                    System.out.println("Search Options:\n1. By Entry Number\n2. By Brand");
                    int searchChoice = sc.nextInt(); sc.nextLine();
                    
                    if (searchChoice == 1) {
                        System.out.print("Enter Entry Number: ");
                        int searchEntryNo = sc.nextInt();
                        InventoryItem found = hashTable.searchItem(searchEntryNo);
                        System.out.println(found != null ? found : "Not found.");
                    } else if (searchChoice == 2) {
                        System.out.print("Enter Brand: ");
                        String searchBrand = sc.nextLine();
                        bst.searchByBrand(searchBrand);
                    } else {
                        System.out.println("Invalid search option.");
                    }
                    break;
                    
                case 0:
                    System.out.println("Exiting program...");
                    break;
                
                default:
                    System.out.println("Invalid choice.");
            }
            
        } while (choice != 0);       
    }
}

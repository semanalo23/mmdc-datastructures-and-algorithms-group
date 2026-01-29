/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mmdcitcore.mmdc.datastructures.algorithms;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASPIRE 7
 */
public class InventoryLoader {
    public static List<InventoryItem> loadInventory(String filePath){
        List<InventoryItem> inventory = new ArrayList<>();
        
        try (CSVReader reader = new CSVReader(new FileReader(filePath))){
            String[] values;
            boolean firstLine = true; //skipping the header row
            
            while ((values = reader.readNext()) != null){
                if (firstLine){
                    firstLine = false;
                    continue;
                }
                int entrNo = Integer.parseInt(values[0]);
                String brand  = values[1];
                String model = values[2];
                String details = values[3];
                double unitPrice = Double.parseDouble(values[4]);
                int stockQty = Integer.parseInt(values[5]);
                String status = values[6];
                
                InventoryItem item = new InventoryItem(
                entrNo, brand, model, details, unitPrice, stockQty,status);
                inventory.add(item);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
          return inventory;
    }
 public static void main (String[] args) {
     List<InventoryItem> inventory = loadInventory("src/main/java/mmdcitcore/mmdc/datastructures/algorithms/MotorPH_Inventory_2025.csv");
     
     for(InventoryItem item : inventory){
         System.out.println(item);
     }
 }
}

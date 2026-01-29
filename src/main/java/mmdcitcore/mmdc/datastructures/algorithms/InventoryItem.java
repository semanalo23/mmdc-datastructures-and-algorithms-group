/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mmdcitcore.mmdc.datastructures.algorithms;

/**
 *
 * @author ASPIRE 7
 */
public class InventoryItem {
    
    //declaring parameters on the sample CSV
    int entrNo;
    String brand;
    String model;
    String details;
    double unitPrice;
    int stockQty;
    String status;
   
    //Constructor
    public InventoryItem(int entrNo, String brand, String model, String details,
                            double unitPrice, int stockQty, String status){
            this.entrNo = entrNo;
            this.brand = brand;
            this.model = model;
            this.details = details;
            this.unitPrice = unitPrice;
            this.stockQty = stockQty;
            this.status = status;
        }
  @Override
  public String toString() {
      return entrNo + " | " + brand + " | " + model + " | " + details + " | " + unitPrice + " | " + stockQty + " | " + status;
  }
}

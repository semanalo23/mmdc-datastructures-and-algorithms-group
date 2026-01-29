/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mmdcitcore.mmdc.datastructures.algorithms;

/**
 *
 * @author ASPIRE 7
 */
public class InventoryNode {
    InventoryItem data;
    InventoryNode next;
    
    public InventoryNode(InventoryItem data){
         this.data = data;
         this.next = null;
    }
}

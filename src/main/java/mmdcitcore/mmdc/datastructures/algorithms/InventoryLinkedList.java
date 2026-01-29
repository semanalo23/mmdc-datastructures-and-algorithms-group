/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mmdcitcore.mmdc.datastructures.algorithms;

/**
 *
 * @author ASPIRE 7
 */
public class InventoryLinkedList {
    private InventoryNode head;
    
    //Add a new stock at the end
    public void addStock(InventoryItem item){
        InventoryNode newNode = new InventoryNode(item);
        if (head == null){
            head = newNode;
        } else{
            InventoryNode temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    
    //Delete stock by entry number
    public void deleteStock(int entrNo){
        if(head == null){
            System.out.println("Inventory is empty.");
            return;
        }
        if (head.data.entrNo == entrNo){
            head = head.next;
            System.out.println("Deleted stock with EntrNo: " + entrNo);
            return;
        }
        InventoryNode prev = head;
        InventoryNode current = head.next;
        
        while(current != null) {
            if (current.data.entrNo == entrNo){
                prev.next = current.next;
                System.out.println("Deleted stock with EntrNo: " + entrNo);
            }
            prev = current;
            current = current.next;
        }
        System.out.println("Stock not found.");
    }
    //Display all inventory
    public void displayInventory(){
        if (head == null){
            System.out.println("Inventory is empty.");
            return;
        }
        InventoryNode temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

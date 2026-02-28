/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mmdcitcore.mmdc.datastructures.algorithms.MS2;

/**
 *
 * @author ASPIRE 7
 */
public class InventoryBST {
    
    // InventoryBST manages the entire tree of motorcycle records.
    // The tree keeps motorcycles arranged alphabetically by brand.
    
    private BSTNode root; // The "top box" of the tree
    
    // Insert a new motorcycle into the tree
    public void insertMotorcycle (InventoryItem item) {
        root = insertRecursiveHelper(root,item);
    }
    
    // Recursive helper method for insertion
    private BSTNode insertRecursiveHelper (BSTNode node, InventoryItem item){
        if (node == null) 
            return new BSTNode(item);
        
        // If the new brand comes before the current brand, go left
        if (item.brand.compareToIgnoreCase(node.item.brand) < 0) {
            node.left = insertRecursiveHelper(node.left, item);
        }
        // Otherwise, go right
        else {
            node.right = insertRecursiveHelper(node.right, item);
        }
        return node;
    }
    
    // Search for motorcycles by brand
    public void searchByBrand(String brand) {
        searchRecursiveHelper(root, brand);
    }
    
    // Recursive helper method for searching
    private void searchRecursiveHelper(BSTNode node, String brand) {
        if (node == null) 
            return;
        
       // If this node matches the brand, display it
       if (node.item.brand.equalsIgnoreCase(brand)) {
           System.out.println(node.item);
       }
       // Continue searching left and right branches
       searchRecursiveHelper(node.left, brand);
       searchRecursiveHelper(node.left, brand);
    }
    
    // Optional: Display all motorcycles in alphabetical order
    public void alphabeticalTraversal() {
       alphabeticalRecursion(root);
    }
    
    //helper recursive method for alphabetical
    private void alphabeticalRecursion(BSTNode node) {
        if (node == null) 
            return;
        
        alphabeticalRecursion(node.left);
        System.out.println(node.item);
        alphabeticalRecursion(node.right);
    }
}

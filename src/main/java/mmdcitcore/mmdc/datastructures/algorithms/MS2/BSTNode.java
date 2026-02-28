/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mmdcitcore.mmdc.datastructures.algorithms.MS2;

/**
 *
 * @author ASPIRE 7
 */
public class BSTNode {
    // BSTNode represents a single "box" in the tree. 
    // Each box holds one motorcycle record and links to two other boxes: 
    // one on the left (brands that come earlier alphabetically) 
    // and one on the right (brands that come later alphabetically).
    
    InventoryItem item;
    BSTNode left; // Link to the left child (smaller brands)
    BSTNode right; // Link to the right child (larger brands)
    
    //Constructor
    public BSTNode(InventoryItem item) {
        this.item = item;
        this.left = null;
        this.right = null;
    }
}

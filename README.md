Overview
This repository contains two separate Java console-based inventory management systems, each demonstrating different data structures and algorithms. Both projects load motorcycle inventory data from a CSV file and provide menu-driven operations, but they differ in their chosen approaches.

📌 Project MS1 – Linked List & Bubble Sort
This project is a Java console-based inventory management system that demonstrates:
Reading inventory data from a CSV file using OpenCSV.
Storing data in a custom linked list (InventoryLinkedList).
Converting the linked list into an array for sorting.
Sorting inventory items by brand, price, or quantity using bubble sort.
Displaying inventory in both linked list and array formats.
Performing basic CRUD operations (Add, Delete, Display).

Project Structure
InventoryItem → Represents a single inventory record.
InventoryNode → Node wrapper for linked list.
InventoryLinkedList → Custom linked list implementation with add, delete, display, and convert-to-array methods.
InventoryLoader → Loads inventory data from CSV using OpenCSV.
InventorySorter → Contains bubble sort methods (by brand, price, quantity).
InventoryDisplay → Utility class for displaying arrays of inventory items.
InventorySearch → Provides search functionality (by entry number, by brand).
MmdcDatastructuresAlgorithms → Main entry point with menu-driven console app.

📌 Project MS2 – Hash Table, BST & Merge Sort
This project is a Java console-based inventory management system that demonstrates:
Reading inventory data from a CSV file (using OpenCSV).
Storing data in a hash table (fast entry-number lookups).
Organizing data in a binary search tree (BST) (brand-based organization).
Sorting inventory items by brand using merge sort.
Performing CRUD operations (Add, Delete, Search, Display).

Project Structure
InventoryItem → Represents a single inventory record.
InventoryHashTable → Hash table implementation for entry-number operations.
BSTNode → Node class for binary search tree.
InventoryBST → BST manager with recursive insert, search, and traversal.
InventorySorter → Merge sort implementation for brand-based sorting.
MS2mainprogram → Main entry point with menu-driven console app.

Dependencies
Both projects require OpenCSVfor proper CSV parsing with quoted fields.

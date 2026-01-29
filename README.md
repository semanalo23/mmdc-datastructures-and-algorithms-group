Overview
This project is a Java console-based inventory management system that demonstrates:
Reading inventory data from a CSV file using OpenCSV.
Storing data in a custom linked list (InventoryLinkedList).
Converting the linked list into an array for sorting.
Sorting inventory items by brand, price, or quantity using bubble sort.
Displaying inventory in both linked list and array formats.
Performing basic CRUD operations (Add, Delete, Display).

Project Structure
InventoryItem → Represents a single inventory record (entry number, brand, model, details, unit price, stock quantity, status).
InventoryNode → Node wrapper for linked list.
InventoryLinkedList → Custom linked list implementation with methods to add, delete, display, and convert to array.
InventoryLoader → Loads inventory data from CSV using OpenCSV.
InventorySorter → Contains bubble sort methods (by brand, price, quantity).
InventoryDisplay → Utility class for displaying arrays of inventory items.
MmdcDatastructuresAlgorithms → Main entry point. Provides a menu-driven console app to interact with the inventory.

Dependencies
This project requires OpenCSV.

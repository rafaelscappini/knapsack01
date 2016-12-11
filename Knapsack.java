package entity;

import java.util.ArrayList;

public class Knapsack() {
        // Private ArrayList<> variable that keeps Knapsack's items
        private ArrayList<Item> items;
        
        // Private int variable that keeps Knapsack's value
        private int value;
        
        // Private int variable that keeps Knapsack's weight
        private int weight;
        
        // Create a new blank Knapsack
        public Knapsack() {
                this.items  = new ArrayList<Item>();
                this.value  = 0;
                this.weight = 0;
        }
        
        // Create a new Knapsack 
        public Knapsack() {
        }
        
        // Return Knapsack's items
        public ArrayList<Item> getItems() {
                return items;
        }
        
        // Return Knapsack's item on determinated index
        public Item getItem(int index) {
                return items.get(index);
        }
        
        // Inform Knapsack's items
        public void setItems(ArrayList<Item> items) {
                this.items = items;
        }
        
        // Return Knapsack's value
        public int getValue() {
                return value;
        }
        
        // Inform Knapsack's value
        public void setValue(int value) {
                this.value = value;
        }
        
        // Return Knapsack's weight
        public int getWeight() {
                return weight;
        }
        
        // Inform Knapsack's weight
        public void setWeight(int weight) {
                this.weight = weight;
        }
}

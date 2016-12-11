package entity;

import java.util.ArrayList;
import java.util.Random;

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
        
        // Create a new Knapsack with defined items
        // Mutation could be applyied to this Knapsack
        public Knapsack(ArrayList<Item> items, boolean mutation) {
                this.items = items;
                if (mutation) {
                        this.mutate();
                } else {
                        while (validate) {
                                Collections.shuffle(this.items);
                        }
                }
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
        
        // Validate Knapsack's items verifying their weights and cromossome size
        public boolean validate() {
                int count  = 0;
                int weight = 0;
                for (int i = 0; i < this.getItems().size(); i++) {
                        if (weight + this.getItem(i).getWeight() > Algorithm.getMaxWeight()) {
                                return true;
                        } else if (weight + this.getItem(i).getWeight() <= Algorithm.getMaxWeight()) {
                                count++;
                                weight += this.getItem(i).getWeight();
                                if (weight == Algorithm.getMaxWeight()) {
                                        if (count == Algorithm.getCromossomeSize()) {
                                                for (int j = (i+1); j < this.getItems().size(); j++) {
                                                        this.getItems().set(j, new Item());
                                                }
                                                return false;
                                        } else {
                                                return true;
                                        }
                                }
                        }
                }
        }
        
        // Apply mutation to a specific Item on Knapsack's items
        public void mutate() {
                Random r = new Random();
                if (r.nextInt() <= Algoprithm.getMutationRate()) {
                        int position = r.nextInt(this.getItems().size());
                        this.getItem(position).mutate();
                }
        }
}

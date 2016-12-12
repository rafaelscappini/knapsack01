package entity;

import java.util.Random;

public class Item {
      // Private integer variable that keeps Item's value
      private int value;
      
      // Private integer variable that keeps Item's weight
      private int weight;
      
      // Create a new Item with no value and wwight
      public Item() {
            this.value  = 0;
            this.weight = 0;
      }
      
      // Create a new Item with defined value and weight
      public Item(int value, int weight) {
            this.value  = value;
            this.weight = weight;
      }
      
      // Return Item's value
      public int getValue() {
            return value;
      }
      
      // Inform Item's value
      public void setValue(int value) {
            this.value = value;
      }
      
      // Return Item's weight
      public int getWeight() {
            return weight;
      }
      
      // Inform Item's weight
      public void setWeight(int weight) {
            this.weight = weight;
      }
      
      // Apply mutation on Item
      public void mutate() {
            Random r = new Random();
            if (r.nextInt(2) == 0) {
                  this.value--;
            } else {
                  this.value++;
            }
      }
      
      // Make comparison on two Item's verifying equalties between them
      @Override
      public boolean equals(Object obj) {
            if ((this.getValue() == ((Item) obj).getValue()) 
            && (this.getWeight() == ((Item) obj).getWeight())) {
                  return true;
            }
            return false;
      }
      
      // Return a String with Item's data
      @Override
      public String toString() {
            return "Value: " + this.getValue() + " | Weight: " + this.getWeight();
      }
}

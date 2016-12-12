package entity;

public class Population {
        // Private array of Knapsack that keeps Population's knapsack
        private Knapsack[] knapsacks;
        
        // Private int that keeps Population's size
        private int size;
        
        // Private int that keeps Population's value
        private int value;
        
        // Private int that keeps Population's weight
        private int weight;
        
        // Create a new Population
        public Population(int size) {
                this.size      = size;
                this.knapsacks = new Knapsack[size];
                for (int i = 0; i < size; i++) {
                        this.knapsacks[i] = new Knapsack(Algorithm.getInitialItems(), false);
                }
        }
        
        // Return Population's knapsacks
        public Knapsack[] getKnapsacks() {
                return knapsacks;
        }
        
        // Return Population's knapsack on determinated index
        public Knapsack getKnapsack(int index) {
                return knapsacks[index];
        }
        
        // Inform Population's knapsacks
        public void setKnapsacks(Knapsack[] knapsacks) {
                this.knapsacks = knapsacks;
        }
        
        // Return Population's size
        public int getSize() {
                return size;
        }
        
        // Inform Population's size
        public void setSize(int size) {
                this.size = size;
        }
        
        // Return Population's value
        public int getValue() {
                return value;
        }
      
        // Inform Population's value
        public void setValue(int value) {
            this.value = value;
        }
         
        // Return Population's weight
        public int getWeight() {
            return weight;
         }
      
        // Inform Population's weight
        public void setWeight(int weight) {
            this.weight = weight;
        }
        
        // Calculate Population's value and weight
        public void evaluate() {
                this.value  = 0;
                this.weight = 0;
                for (int i = 0; i < size; i++) {
                        this.knapsacks[i].evaluate();
                        this.value  += this.knapsacks[i].getValue();
                        this.weight += this.knapsacks[i].getWeight();
                }
        }
        
        // Order Population by weight and value
        public void order() {
                boolean weightOrder = true;
        	while (weightOrder) {
            		weightOrder = false;
            		for (int i = 0; i < this.getSize() - 1; i++) {
            	        	if (this.getKnapsack(i).getWeight() < this.getKnapsack(i+1).getWeight()) {
            		        	Knapsack k          = this.getKnapsack(i);
                                    	this.knapsacks[i]   = this.getKnapsack(i+1);
                                    	this.knapsacks[i+1] = k;
                                    	weightOrder = true;
            			}
            		}
        	}
        	boolean valueOrder = true;
        	while (valueOrder) {
        		valueOrder = false;
        		for (int i = 0; i < this.getSize() - 1; i++) {
        			if ((this.getKnapsack(i).getWeight() == this.getKnapsack(i+1).getWeight()) 
        			&& (this.getKnapsack(i).getValue() < this.getKnapsack(i+1).getValue())) {
        	        	        Knapsack k          = this.getKnapsack(i);
        				this.knapsacks[i]   = this.getKnapsack(i+1);
        				this.knapsacks[i+1] = k;
        				valueOrder = true;
        			}
        		}
        	}
        }
}

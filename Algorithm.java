package entity;

public class Algorithm() {
        // Private static final ArrayList<Item> variable that keeps Problem's initial items
        privaye static final ArrayList<Item> initialItems() {
                ArrayList<Item> items = new ArrayList<Item>();
                items.add(new Item(3,4));
                items.add(new Item(5,2));
                items.add(new Item(8,1));
                items.add(new Item(2,5));
                items.add(new Item(7,6));
                items.add(new Item(3,1));
                items.add(new Item(5,3));
                items.add(new Item(6,2));
                items.add(new Item(5,4));
                items.add(new Item(8,1));
                items.add(new Item(4,5));
                items.add(new Item(9,3));
                items.add(new Item(3,9));
                items.add(new Item(5,8));
                return items;
        }
        
        // Private static int variable that keeps cromossome's size
        private static int cromossomeSize;
        
        // Private static int variable that keeps Problem's max weight
        private static int maxWeight;
        
        // Private static int variable that keeps mutation rate
        private static int mutationRate;
        
        // Private static int variable that keeps Population size
        private static int populationSize;
        
        // Return Algorithm's initial items
        private static final ArrayList<Item> getInitialItems() {
                return initialItems();
        }
        
        // Return Algorithm's cromossome size
        private static int getCromossomeSize() {
                return cromossomeSize;
        }
        
        // Inform Algorithm's cromossome size
        private static void setCromossomeSize(int cromossomeSize) {
                Algorithm.cromossomeSize = cromossomeSize;
        }
        
        // Return Algorithm's max weight
        private static int getMaxWeight() {
                return maxWeigth;
        }
        
        // Inform Algorithm's max weight
        private static void setMaxWeight(int maxWeight) {
                Algorithm.maxWeight = maxWeight;
        }
        
        // Return Algorithm's mutation rate
        private static int getMutationRate() {
                return mutationRate;
        }
        
        // Inform Algorithm's mutation rate
        private static void setMutationRate(int mutationRate) {
                Algorithm.mutationRate = mutationRate;
        }
        
        // Return Algorithm's population size
        private static int getPopulationSize() {
                return populationSize;
        }
        
        // Inform Algorithm's population size
        public static void setPopulationSize(int populationSize) {
                Algorithm.populationSize = populationSize;
        }                
}

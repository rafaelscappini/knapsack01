package entity;

import java.util.Random;

public class Main() {
        // Create population
        public static void createPopulation() {
                System.out.println("Creating population of " + Algorithm.getPopulationSize() + " knapsacks..."); 
                Population population = new Population(Algorithm.getPopulationSize());
                System.out.println("Population created successfully!\n");
        }
        
        // Elitism method (once, returns fittest knapsack)
        public static Knapsack elitism(Population population) {
                System.out.println("Aplying elitism...");
                population.order();
                return population.getKnapsack(0);
                System.out.println("Elitism aplyied successfully!\n");
        }
        
        // Evaluate population
        public static void evaluatePopulation() {
                System.out.println("Evaluating population...");
                population.evaluate();
                System.out.println("Population evaluated successfully!\n");
        }
        
        // Main
        public static void main(String[] args) {
                Algorithm.setCromossomeSize(6);
                Algorithm.setMaxWeight(30);
                Algorithm.setMutationRate(50);
                Algorithm.setPopulationSize(10);
                
                createPopulation();
        }
        
        // Roulette Selection method
        public static Knapsack[] rouletteSelection(Population population) {
                System.out.println("Choosing knapsacks by roulette selection...");
                Knapsack[] selected = new Knapsack[2];
                population.evaluate();
                int T = population.getValue();
                Random r = new Random();
                int S = 0;
                for (int i = 0; i < 2; i++) {
                        int R = r.nextInt(T);
                        for (int j = 0; j < population.getSize(); j++) {
                                S += population.getKnapsack(j).getValue();
                                if (S >= R) {
                                        selected[j] = population.getKnapsack(j);
                                }
                        }
                }
                System.out.println("Knapsacks chosen successfully!\n");
                return selected;
        }
        
        // Tour selection method (twice, choose two different knapsacks and return the fittest or not) 
        public static Knapsack[] tourSelection(Population population) {
                System.out.println("Choosing knapsacks by tour selection...");
                Knapsack[] selected = new Knapsack[2];
                double D = 0.75;
                Random r = new Random();
                for (int i = 0; i < 2; i++) {
                        Knapsack k1 = population.getKnapsack(r.nextInt(population.getSize()));
                        Knapsack k2 = population.getKnapsack(r.nextInt(population.getSize()));
                        while (k1.equals(k2)) {
                                k2 = population.getKnapsack(r.nextInt(population.getSize()));
                        }
                        int R = r.nextInt(2);
                        if (R < D) {
                                if (k1.getValue() > k2.getValue()) {
                                        selected[i] = k1;
                                } else {
                                        selected[i] = k2;
                                }
                        } else {
                                if (k1.getValue() > k2.getValue()) {
                                        selected[i] = k2;
                                } else {
                                        selected[i] = k1;
                                }
                        }
                }
                System.out.println("Knapsacks chosen successfully!\n");
                return selected;
        }
}

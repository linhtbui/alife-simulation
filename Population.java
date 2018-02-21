import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

public class Population {
    private ArrayList<Organism> population;
    
    //pass in a seed to recreate the result
    static Random generator = new Random(15);
    
    /**
     * Is a constructor for a population
     * 
     * @param counts A HashMap that maps Strings to integers.
     * @throws IllegalArgumentException
     */
    public Population(Map<String, Integer> counts) throws IllegalArgumentException  {
        int size = 0;
        for (Entry<String, Integer> e : counts.entrySet()) {
            size += e.getValue();
        }
        population = new ArrayList<Organism>(size);

        // Populate the population
        for (int i = 0; i < counts.get("Cooperator").intValue(); i++) {
            population.add(new Cooperator());
        }
        for (int i = 0; i < counts.get("Defector").intValue(); i++) {
            population.add(new Defector());
        }
        for (int i = 0; i < counts.get("PartialCooperator").intValue(); i++) {
            population.add(new PartialCooperator());
        }
    }

    /**
     * loops through all the organisms in the population and (1) updates them (
     * by calling their update method), (2) checks to see if they cooperate as described 
     * above and (3) checks to see if they reproduce. We check to see if an organism 
     * reproduces by first checking its energy level. If the organism has at least 10 
     * energy units, then it reproduces and that new organism replaces a random organism 
     * in the population.
     */
    public void update() {

        // List to store new reproduced organisms
        LinkedList<Organism> List = new LinkedList<>();

        for (Organism organism : population) {
            organism.update();

            // Cooperation
            if (organism.cooperates(generator) && organism.getEnergy() >= 1) {
                if (population.size() > 1) {
                    organism.decrementEnergy();
                    // Chooses a random organism in the populatino to replace
                    for (int i = 0; i < 8; i++) {
                        Organism randOrg = population
                                .get(generator.nextInt(population.size()));
                        while (randOrg == organism) {
                            randOrg = population
                                    .get(generator.nextInt(population.size()));
                        }
                        randOrg.incrementEnergy();
                    }
                }
            }

            // Reproduction
            if (organism.getEnergy() >= 10) {
                List.addFirst(organism.reproduce());
            }
        }
        
        // Gets all of the reproduced organisms until the LinkedList is null and replaced a random organism in population. 
        while (List.size() > 0) {
            Organism n = List.poll();
            population.set(generator.nextInt(population.size()), n);
        }
    }

    /**
     * calculates the mean cooperation probability of all the organisms in the population—the 
     * average of the cooperation probabilities of all the organisms in the population.
     * @return
     */
    public double calculateCooperationMean() {
        double cooperationTotal = 0.0;
        for (Organism o : population) {
            cooperationTotal += o.getCooperationProbability();
        }
        return cooperationTotal / population.size();
    }

    public Map<String, Integer> getPopulationCounts() {
        Map<String, Integer> populationMap = new HashMap<>();
        int coopCount = 0, defCount = 0, partCount = 0;
        for (Organism o : population) {
            switch (o.getType()) {
            case "Cooperator":
                coopCount++;
                break;
            case "Defector":
                defCount++;
                break;
            case "PartialCooperator":
                partCount++;
            }
        }
        populationMap.put("Cooperator", new Integer(coopCount));
        populationMap.put("Defector", new Integer(defCount));
        populationMap.put("PartialCooperator", new Integer(partCount));
        return populationMap;
    }

}

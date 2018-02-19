import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ThreadLocalRandom;

public class Population {
    private ArrayList<Organism> population;

    
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

        LinkedList<Organism> List = new LinkedList<>();

        for (Organism organism : population) {
            organism.update();

            // Cooperation
            if (organism.cooperates() && organism.getEnergy() >= 1) {
                if (population.size() > 1) {
                    organism.decrementEnergy();
                    for (int i = 0; i < 8; i++) {
                        Organism randOrg = population
                                .get(ThreadLocalRandom.current().nextInt(population.size()));
                        while (randOrg == organism) {
                            randOrg = population
                                    .get(ThreadLocalRandom.current().nextInt(population.size()));
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

        while (List.size() > 0) {
            Organism n = List.poll();
            population.set(ThreadLocalRandom.current().nextInt(population.size()), n);
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

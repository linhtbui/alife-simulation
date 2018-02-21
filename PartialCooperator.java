import java.util.Random;

public class PartialCooperator extends Organism {

	/**
	 * Constructor with default methods of Organism abstract class
	 */
	public PartialCooperator() {
		super();
	}
	/**
	 * @return: Return type of organism
	 */
	public String getType() {
		return "PartialCooperator";
	}
	/**
	 * Reproduce a new PartialCooperator and decreased its energy by 10
	 * @return: the new PartialCooperator
	 */
	public Organism reproduce() {
		this.reduceEnergyBy10();
		return new PartialCooperator();
	}
	/**
	 * @return: the cooperation probability of PartialCooperator
	 */
	public double getCooperationProbability() {
		return 0.5;
	}


	/**
	 * @return: a boolean - the ability to cooperate of PartialCooperator
	 */
	public boolean cooperates(Random generator) {
		
		return generator.nextInt(1) > 0.5;
	}

	
}
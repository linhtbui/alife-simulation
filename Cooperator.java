
public class Cooperator extends Organism {

	/**
	 * Constructor with default methods of Organism abstract class
	 */
	public Cooperator() {
		super();
	}
	
	/**
	 * @return: Return type of organism
	 */
	public String getType() {
		return "Cooperator";
	}

	/**
	 * Reproduce a new Cooperator and decreased its energy by 10
	 * @return: the new Cooperator
	 */
	public Organism reproduce() {
		this.reduceEnergyBy10();
		return new Cooperator();
	}

	/**
	 * @return: the cooperation probability of Cooperator
	 */
	public double getCooperationProbability() {
		return 1.0;
	}

	/**
	 * @return: a boolean - the ability to cooperate of PartialCooperator
	 */
	public boolean cooperates() {
		return true;
	}

}
public class Defector extends Organism {

	/**
	 * Constructor with default methods of Organism abstract class
	 */
	public Defector() {
		super();
	}
	/**
	 * @return: Return type of organism
	 */
	public String getType() {
		return "Defector";
	}
	/**
	 * Reproduce a new Defector and decreased its energy by 10
	 * @return: the new Defector
	 */

	public Organism reproduce() {
		this.reduceEnergyBy10();
		return new Defector();
	}

	/**
	 * @return: the cooperation probability of Defectors
	 */
	public double getCooperationProbability() {
		return 0;
	}

	/**
	 * @return: a boolean - the ability to cooperate of Defectors
	 */
	public boolean cooperates() {
		return false;
	}

}
public abstract class Organism {

	private int energy;
	/**
	 * Constructor: create a new organism
	 */
	public Organism() {	
		this.energy = 0;
	}
	/**
	 *  the energy of the organism
	 */
	void update() {
		incrementEnergy();
	}
	
	/**
	 * Get the current energy of the organism
	 * @return energy, an integer
	 */
	int getEnergy() {
		return this.energy;
	}
	
	/**
	 * Increment the energy of the organism
	 */
	void incrementEnergy() {
		this.energy++;
	}
	/**
	 * Reduce the energy of the organism by 10 if it has more than 10 energy
	 */
	void reduceEnergyBy10() {
		if (this.energy >=10) {
			this.energy = getEnergy() - 10;
		}
	}
	/**
	 * Decrement the energy of the organism
	 */
	void decrementEnergy() {
		if(this.energy > 0) {
			this.energy--;
		}
		else {
			this.energy = 0;
		}
	}
	
	public abstract String getType();
	public abstract Organism reproduce();
	public abstract double getCooperationProbability();
	public abstract boolean cooperates();
}


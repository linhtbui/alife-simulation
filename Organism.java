

public abstract class Organism {

	private int energy;
	
	public Organism() {	
		this.energy = 0;
	}
	
	void update() {
		incrementEnergy();
	}
	
	int getEnergy() {
		return this.energy;
	}
	
	void incrementEnergy() {
		this.energy++;
	}
	
	void reduceEnergyBy10() {
		if (this.energy >=10) {
			this.energy = getEnergy() - 10;
		}
	}
	
	void decrementEnergy() {
		if(this.energy > 0) {
			this.energy--;
		}
		else {
			this.energy = 0;
		}
	}
	
	abstract String getType();
	abstract Organism reproduce();
	abstract double getCooperationProbability();
	abstract boolean cooperates();

	
}

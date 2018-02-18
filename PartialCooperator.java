import java.util.Random;

public class PartialCooperator extends Organism {

	Random random = new Random();
	
	public PartialCooperator() {
		super();
	}
	
	String getType() {
		return "PartialCooperator";
	}

	Organism reproduce() {
		this.reduceEnergyBy10();
		return new PartialCooperator();
	}

	double getCooperationProbability() {
		return 0.5;
	}

	boolean cooperates() {
		return this.random.nextBoolean();
	}

	
}

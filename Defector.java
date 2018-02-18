
public class Defector extends Organism {

	
	public Defector() {
		super();
	}
	String getType() {
		return "Defector";
	}

	Organism reproduce() {
		this.reduceEnergyBy10();
		return new Defector();
	}

	
	double getCooperationProbability() {
		return 0;
	}

	boolean cooperates() {
		return false;
	}

}

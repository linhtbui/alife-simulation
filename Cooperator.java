
public class Cooperator extends Organism {

	public Cooperator() {
		super();
	}
	
	String getType() {
		return "Cooperator";
	}


	Organism reproduce() {
		this.reduceEnergyBy10();
		return new Cooperator();
	}

	
	double getCooperationProbability() {
		return 1.0;
	}

	
	boolean cooperates() {
		return true;
	}

}

import java.util.HashMap;
import java.util.Map;

public class ALifeSim {
	public static void main(String[] args) {
		if (args.length != 4) {
			System.out.println("The program requires 4 arguments");
			return;
		}
		int iterations = Integer.parseInt(args[0]);
		int cooperators = Integer.parseInt(args[1]);
		int defectors = Integer.parseInt(args[2]);
		int partialCooperators = Integer.parseInt(args[3]);
		
		Map<String, Integer> popMap = new HashMap<String, Integer>();
		popMap.put("Cooperator", cooperators);
		popMap.put("Defector", defectors);
		popMap.put("PartialCooperator", partialCooperators);
		Population newPop = new Population(popMap);
		for (int i = 0; i < iterations; i++) {
			newPop.update();
		}
		popMap = newPop.getPopulationCounts();
		System.out.printf("After %d ticks\n", iterations);
		System.out.printf("Cooperators = %d\n", popMap.get("Cooperator"));
		System.out.printf("Defectors = %d\n", popMap.get("Defector"));
		System.out.printf("PartialCooperators = %d\n", popMap.get("PartialCooperator"));
		System.out.printf("Mean Cooperation Probability = %f\n", newPop.calculateCooperationMean());
				
	}

}

package compute;

public class ComputeUtility {
    public static void updateTotalAfterState0(ComputingObject compute, char input) {
	compute.setTotal(0);
	compute.setInput(Character.getNumericValue(input));
	printComputeObject(compute);

    }

    public static void updateTotalDuringState1(ComputingObject compute, char input) {
	compute.setTotal(0);
	compute.setInput(10 * compute.getInput() + Character.getNumericValue(input));
	printComputeObject(compute);
    }

    public static void updateTotalAfterState1(ComputingObject compute, char input) {
	compute.setTotal(compute.getInput());
	compute.setInput(0);
	compute.setOperatorO(input);
	printComputeObject(compute);

    }

    public static void updateTotalDuringState2(ComputingObject compute, char input) {
	compute.setTotal(compute.getTotal());
	compute.setInput(10 * compute.getInput() + Character.getNumericValue(input));
	printComputeObject(compute);
    }

    public static void updateCompleteTotalAfterState2(ComputingObject compute, char input) {
	int total = 0;
	if ('-' == compute.getOperatorO()) {
	    total = compute.getTotal() - compute.getInput();
	} else if ('+' == compute.getOperatorO()) {
	    total = compute.getTotal() + compute.getInput();
	}
	compute.setTotal(total);
	printComputeObject(compute);
    }

    public static void updateTotalAfterState2(ComputingObject compute, char input) {
	int total = 0;
	if ('-' == compute.getOperatorO()) {
	    total = compute.getTotal() - compute.getInput();
	} else if ('+' == compute.getOperatorO()) {
	    total = compute.getTotal() + compute.getInput();
	}
	compute.setTotal(total);
	compute.setInput(0);
	compute.setOperatorK(input);
	printComputeObject(compute);
    }

    public static void updateTotalDuringState3(ComputingObject compute, char input) {
	compute.setTotal(compute.getTotal());
	compute.setInput(10 * compute.getInput() + Character.getNumericValue(input));
	printComputeObject(compute);
    }

    public static void updateCompleteTotalAfterState3(ComputingObject compute, char input) {
	int total = 0;
	if ('-' == compute.getOperatorK()) {
	    total = compute.getTotal() - compute.getInput();
	} else if ('+' == compute.getOperatorK()) {
	    total = compute.getTotal() + compute.getInput();
	}
	compute.setTotal(total);
	printComputeObject(compute);
    }

    public static void updateTotalAfterState3(ComputingObject compute, char input) {
	int total = 0;
	if ('-' == compute.getOperatorK()) {
	    total = compute.getTotal() - compute.getInput();
	} else if ('+' == compute.getOperatorK()) {
	    total = compute.getTotal() + compute.getInput();
	}
	compute.setTotal(total);
	compute.setInput(0);
	compute.setOperatorO(input);
	printComputeObject(compute);
    }

    public static void printComputeObject(ComputingObject compute) {
	if (System.getProperty("print").equals("y")) {
	    System.out.println(compute);
	}
    }
}

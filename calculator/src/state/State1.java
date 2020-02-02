package state;

import calculator.Calculator;

public class State1 extends StateAbstract {

    private static State1 state1_Instance = null;

    private State1() {
    }

    public static State1 getInstance() {
	if (state1_Instance == null)
	    state1_Instance = new State1();

	return state1_Instance;
    }

    @Override
    public void processInput(Calculator calculator, char input) {
	if (System.getProperty("print").equals("y")) {
	    System.out.println("In State1 processInput(): Input: " + input);
	}
	if (Character.isDigit(input)) {
	    calculator.updateTotalDuringState1(input);
	    calculator.setState(State1.getInstance());
	    if (System.getProperty("print").equals("y")) {
		System.out.println("Transitioning to State1. Now in State1");
	    }
	} else if (input == '=') {
	    calculator.setState(StateError3.getInstance());
	    calculator.setErrorFound(true);
	} else if ((input != '+' && input != '-') && (Character.isLetter(input))) {
	    calculator.setState(StateError2.getInstance());
	    calculator.setErrorFound(true);
	} else if (input == '+' || input == '-') {
	    calculator.updateTotalAfterState1(input);
	    calculator.setState(State2.getInstance());
	    if (System.getProperty("print").equals("y")) {
		System.out.println("Transitioning to State2. Now in State2");
	    }
	} else {
	    calculator.setState(StateError2.getInstance());
	    calculator.setErrorFound(true);
	}
    }
}
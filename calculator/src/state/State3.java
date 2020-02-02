package state;

import calculator.Calculator;

public class State3 extends StateAbstract {
    private static State3 state3_Instance = null;

    private State3() {
    }

    public static State3 getInstance() {
	if (state3_Instance == null)
	    state3_Instance = new State3();

	return state3_Instance;
    }

    @Override
    public void processInput(Calculator calculator, char input) {
	if (System.getProperty("print").equals("y")) {
	    System.out.println("In State3 processInput(): Input: " + input);
	}
	if (Character.isDigit(input)) {
	    calculator.updateTotalDuringState3(input);
	    calculator.setState(State3.getInstance());
	    if (System.getProperty("print").equals("y")) {
		System.out.println("Transitioning to State3. Now in State3");
	    }
	} else if (input == '=') {
	    calculator.updateCompleteTotalAfterState3(input);
	    calculator.setState(StateEnd.getInstance());
	    calculator.setEndStateReached(true);

	} else if ((input != '+' && input != '-') && (Character.isLetter(input))) {
	    calculator.setState(StateError2.getInstance());
	    calculator.setErrorFound(true);
	} else if (input == '+' || input == '-') {
	    calculator.updateTotalAfterState3(input);
	    if (System.getProperty("print").equals("y")) {
		System.out.println("Transitioning to State2. Now in State2");
	    }
	    calculator.setState(State2.getInstance());
	} else {
	    calculator.setState(StateError2.getInstance());
	    calculator.setErrorFound(true);
	}
    }

}

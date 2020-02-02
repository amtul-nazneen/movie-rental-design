package state;

import calculator.Calculator;

public class State2 extends StateAbstract {
    private static State2 state2_Instance = null;

    private State2() {
    }

    public static State2 getInstance() {
	if (state2_Instance == null)
	    state2_Instance = new State2();

	return state2_Instance;
    }

    @Override
    public void processInput(Calculator calculator, char input) {
	if (System.getProperty("print").equals("y")) {
	    System.out.println("In State2 processInput(): Input: " + input);
	}
	if (Character.isDigit(input)) {
	    calculator.updateTotalDuringState2(input);
	    calculator.setState(State2.getInstance());
	    if (System.getProperty("print").equals("y")) {
		System.out.println("Transitioning to State2. Now in State2");
	    }
	} else if (input == '=') {
	    calculator.updateCompleteTotalAfterState2(input);
	    calculator.setState(StateEnd.getInstance());
	    calculator.setEndStateReached(true);

	} else if ((input != '+' && input != '-') && (Character.isLetter(input))) {
	    calculator.setState(StateError2.getInstance());
	    calculator.setErrorFound(true);
	} else if (input == '+' || input == '-') {
	    calculator.updateTotalAfterState2(input);
	    if (System.getProperty("print").equals("y")) {
		System.out.println("Transitioning to State3. Now in State3");
	    }
	    calculator.setState(State3.getInstance());

	} else {
	    calculator.setState(StateError2.getInstance());
	    calculator.setErrorFound(true);
	}
    }
}

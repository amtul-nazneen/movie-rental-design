package state;

import calculator.Calculator;

public class State0 extends StateAbstract {

    private static State0 state0_Instance = null;

    private State0() {
    }

    public static State0 getInstance() {
	if (state0_Instance == null)
	    state0_Instance = new State0();

	return state0_Instance;
    }

    @Override
    public void processInput(Calculator calculator, char input) {
	if (System.getProperty("print").equals("y")) {
	    System.out.println("In State0 processInput(): Input: " + input);
	}
	if ('0' == input) {
	    calculator.setState(StateError0.getInstance());
	    calculator.setErrorFound(true);
	} else if ('+' == input || '-' == input || '=' == input) {
	    calculator.setState(StateError1.getInstance());
	    calculator.setErrorFound(true);
	} else if (Character.isDigit(input)) {
	    calculator.updateTotalAfterState0(input);
	    calculator.setState(State1.getInstance());
	    if (System.getProperty("print").equals("y")) {
		System.out.println("Transitioning to State1. Now in State1");
	    }
	} else {
	    calculator.setState(StateError2.getInstance());
	    calculator.setErrorFound(true);
	}

    }
}
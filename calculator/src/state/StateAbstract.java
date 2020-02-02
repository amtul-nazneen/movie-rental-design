package state;

import calculator.Calculator;

public abstract class StateAbstract {

    public void processInput(Calculator calculator, char input) {
    }

    public String returnError() {
	return null;
    }
}

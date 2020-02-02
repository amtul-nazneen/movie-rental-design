package calculator;

import compute.ComputeUtility;
import java.util.Scanner;

import compute.ComputingObject;
import state.State0;
import state.StateAbstract;

public class Calculator {
    ComputingObject compute;
    StateAbstract state;
    boolean errorFound;
    boolean endStateReached;

    public boolean isEndStateReached() {
	return endStateReached;
    }

    public void setEndStateReached(boolean endStateReached) {
	this.endStateReached = endStateReached;
    }

    public Calculator() {
	this.compute = new ComputingObject();
	this.state = State0.getInstance();
	this.errorFound = false;
	this.endStateReached = false;
    }

    public boolean isErrorFound() {
	return errorFound;
    }

    public void setErrorFound(boolean errorFound) {
	this.errorFound = errorFound;
    }

    public StateAbstract getState() {
	return state;
    }

    public void setState(StateAbstract state) {
	this.state = state;
    }

    public ComputingObject getCompute() {
	return compute;
    }

    public void setCompute(ComputingObject compute) {
	this.compute = compute;
    }

    public int run() throws Exception {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Please enter your inputs: ");
	char input;
	int total = 0;

	while (true) {
	    input = scanner.next().charAt(0);
	    if (System.getProperty("print").equals("y")) {
		System.out.println("You entered: " + input);
		System.out.println(" ******* ********* ");
	    }
	    this.getState().processInput(this, input);

	    if (isErrorFound()) {
		scanner.close();
		throw new Exception(this.getState().returnError());
	    }
	    if (isEndStateReached()) {
		total = getCompute().getTotal();
		if (System.getProperty("print").equals("y")) {
		    System.out.println("Calculation complete, returning total: " + total);
		}
		break;
	    }

	}
	scanner.close();
	return total;

    }

    public void updateTotalAfterState0(char input) {
	ComputeUtility.updateTotalAfterState0(getCompute(), input);
    }

    public void updateTotalDuringState1(char input) {
	ComputeUtility.updateTotalDuringState1(getCompute(), input);
    }

    public void updateTotalAfterState1(char input) {
	ComputeUtility.updateTotalAfterState1(getCompute(), input);
    }

    public void updateTotalDuringState2(char input) {
	ComputeUtility.updateTotalDuringState2(getCompute(), input);
    }

    public void updateCompleteTotalAfterState2(char input) {
	ComputeUtility.updateCompleteTotalAfterState2(getCompute(), input);
    }

    public void updateTotalAfterState2(char input) {
	ComputeUtility.updateTotalAfterState2(getCompute(), input);
    }

    public void updateTotalDuringState3(char input) {
	ComputeUtility.updateTotalDuringState3(getCompute(), input);
    }

    public void updateCompleteTotalAfterState3(char input) {
	ComputeUtility.updateCompleteTotalAfterState3(getCompute(), input);
    }

    public void updateTotalAfterState3(char input) {
	ComputeUtility.updateTotalAfterState3(getCompute(), input);
    }
}
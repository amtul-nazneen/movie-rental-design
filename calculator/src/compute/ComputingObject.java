package compute;

public class ComputingObject {
    int total;
    int input;
    char operatorO;
    char operatorK;

    public char getOperatorO() {
	return operatorO;
    }

    public void setOperatorO(char operatorO) {
	this.operatorO = operatorO;
    }

    public char getOperatorK() {
	return operatorK;
    }

    public void setOperatorK(char operatorK) {
	this.operatorK = operatorK;
    }

    public int getTotal() {
	return total;
    }

    public void setTotal(int total) {
	this.total = total;
    }

    public int getInput() {
	return input;
    }

    public void setInput(int input) {
	this.input = input;
    }

    @Override
    public String toString() {
	return "T: " + total + " n: " + input + " o: " + operatorO + " k: " + operatorK;
    }
}

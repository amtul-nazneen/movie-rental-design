import calculator.*;

public class Runner {

    public static void main(String[] args) {
	System.setProperty("print", "n");
	Calculator calculator = new Calculator();
	int total;
	try {
	    total = calculator.run();
	    System.out.println("The total is: " + total);
	} catch (Exception e) {
	    System.out.println("User Input Error. Please recheck your inputs and try again. \n" + e.getMessage());
	}

    }

}

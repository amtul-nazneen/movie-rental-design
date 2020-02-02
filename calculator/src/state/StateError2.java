package state;

public class StateError2 extends StateAbstract {
    private static StateError2 stateErr2_Instance = null;
    public String error;

    private StateError2() {
	error = "ERROR: CALC-4298 \nDETAILS: Only valid characters are [0-9] and + and -.";
    }

    public static StateError2 getInstance() {
	if (stateErr2_Instance == null)
	    stateErr2_Instance = new StateError2();

	return stateErr2_Instance;
    }

    @Override
    public String returnError() {
	return error;
    }
}

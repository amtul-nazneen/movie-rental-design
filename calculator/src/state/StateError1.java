package state;

public class StateError1 extends StateAbstract {
    private static StateError1 stateErr1_Instance = null;
    public String error;

    private StateError1() {
	error = "ERROR: CALC-4297 \nDETAILS: '+', '-' or '=' is not a valid first input.";
    }

    public static StateError1 getInstance() {
	if (stateErr1_Instance == null)
	    stateErr1_Instance = new StateError1();

	return stateErr1_Instance;
    }

    @Override
    public String returnError() {
	return error;
    }
}

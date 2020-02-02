package state;

public class StateError3 extends StateAbstract {
    private static StateError3 stateErr3_Instance = null;
    public String error;

    private StateError3() {
	error = "ERROR: CALC-4298 \nDETAILS: Invalid use of '=', provide more than one input to use '='.";
    }

    public static StateError3 getInstance() {
	if (stateErr3_Instance == null)
	    stateErr3_Instance = new StateError3();

	return stateErr3_Instance;
    }

    @Override
    public String returnError() {
	return error;
    }
}

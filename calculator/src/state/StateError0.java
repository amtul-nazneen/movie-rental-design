package state;

public class StateError0 extends StateAbstract {
    private static StateError0 stateErr0_Instance = null;
    public String error;

    private StateError0() {
	error = "ERROR: CALC-4296 \nDETAILS: 0 is not a valid first input.";
    }

    public static StateError0 getInstance() {
	if (stateErr0_Instance == null)
	    stateErr0_Instance = new StateError0();

	return stateErr0_Instance;
    }

    @Override
    public String returnError() {
	return error;
    }
}

package state;

public class StateEnd extends StateAbstract {
    private static StateEnd stateEnd_Instance = null;

    private StateEnd() {
    }

    public static StateEnd getInstance() {
	if (stateEnd_Instance == null)
	    stateEnd_Instance = new StateEnd();

	return stateEnd_Instance;
    }
}

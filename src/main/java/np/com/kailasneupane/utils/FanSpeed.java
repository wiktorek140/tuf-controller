package np.com.kailasneupane.utils;

public enum FanSpeed {
    SILENT("0"), 
    NORMAL("1"),
    FAST("2");

    public final String value;

    private FanSpeed(String value) {
        this.value = value;
    }
};
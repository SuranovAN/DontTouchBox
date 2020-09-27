public class Toggle {
    public static final Toggle toggle = new Toggle();
    private static volatile ToggleSwitch status = ToggleSwitch.OFF;

    public static ToggleSwitch getStatus() {
        return status;
    }

    public void setStatus(ToggleSwitch status) {
        Toggle.status = status;
    }
}

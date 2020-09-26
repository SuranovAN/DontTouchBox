public class Toggle {
    private static Toggle toggle;
    private volatile ToggleSwitch status = ToggleSwitch.OFF;

    public static Toggle getInstance() {
        if (toggle == null) {
            toggle = new Toggle();
        }
        return toggle;
    }

    public ToggleSwitch getStatus() {
        return status;
    }

    public void setStatus(ToggleSwitch status) {
        this.status = status;
    }
}

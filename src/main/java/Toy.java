public class Toy implements Runnable {
    private boolean stop = false;
    User user = new User();
    Toggle toggle = Toggle.getInstance();

    public void checkToggle() {
        if (toggle.getStatus() == ToggleSwitch.ON) {
            System.out.println(getName() + "Toggle off");
            toggle.setStatus(ToggleSwitch.OFF);
        }
    }

    private String getName() {
        return Thread.currentThread().getName();
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    @Override
    public void run() {
        while (!stop) {
            checkToggle();
        }
    }
}

public class Toy implements Runnable {
    Toggle toggle = Toggle.toggle;

    public void checkToggle() {
        if (Toggle.getStatus() == ToggleSwitch.ON) {
            System.out.println("Toggle off");
            toggle.setStatus(ToggleSwitch.OFF);
        }
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            checkToggle();
        }
    }
}

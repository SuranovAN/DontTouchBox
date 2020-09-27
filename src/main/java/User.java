public class User implements Runnable {
    Toggle toggle = Toggle.toggle;
    private final int waitTime = 3000;

    public void setToggle() {
        try {
            Thread.sleep(waitTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName() + "Toggle ON");
        toggle.setStatus(ToggleSwitch.ON);
    }

    private String getName() {
        return Thread.currentThread().getName();
    }

    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            setToggle();
        }
    }
}

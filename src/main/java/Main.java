public class Main {
    private static final Toggle toggle = new Toggle();
    public static void main(String[] args) {
        final Toy toy = new Toy();
        final User user = new User();

        Thread userThread = new Thread(null, user, "Пользователь ");
        Thread toyThread = new Thread(null, toy, "игрушка ");
        toyThread.start();
        userThread.start();

        try {
            userThread.join();
            toyThread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("игра окончена");
    }
}

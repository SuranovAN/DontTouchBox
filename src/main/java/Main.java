public class Main {
    public static void main(String[] args) {
        final Toy toy = new Toy();
        final User user = new User();

        Thread userThread = new Thread(null, user, "Пользователь ");
        Thread toyThread = new Thread(null, toy, "игрушка ");
        toyThread.start();
        userThread.start();

        try {
            userThread.join();
            toy.setStop(true);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("игра окончена");
    }
}

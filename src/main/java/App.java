public class App {
    public static void main(String[] args) {
        try {
            Dispatcher.getInstance().service();
        } catch (Exception e) {
            throw e;
        }
    }
}

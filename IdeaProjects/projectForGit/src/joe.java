public class joe {
    private int mich;
    private static joe ourInstance = new joe();

    public static joe getInstance() {
        return ourInstance;
    }

    private joe() {
    }
}

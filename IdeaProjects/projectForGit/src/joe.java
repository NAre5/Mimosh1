public class joe {
    private static joe ourInstance = new joe();

    public static joe getInstance() {
        return ourInstance;
    }

    private joe() {
    }
}

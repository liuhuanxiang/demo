package structured.singleton.august26;

public class Singleton {

    private Singleton() {
    }

    public static Singleton getINSTANCE() {
        return Holder.INSTANCE;
    }

    private static class Holder {
        private static final Singleton INSTANCE = new Singleton();
    }
}

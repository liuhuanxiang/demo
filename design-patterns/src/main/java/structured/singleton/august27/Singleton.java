package structured.singleton.august27;

public class Singleton {

    private Singleton() {

    }

    private static class Holder{
        private static final Singleton INSTANCE = new Singleton();

    }
    public static Singleton getINSTANCE() {
        return Holder.INSTANCE;
    }
}

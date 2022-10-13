package structured.singleton.august29;

public class Singleton29 {

    private Singleton29(){

    }

    private static class Holder{
        private static final Singleton29 INSTANCE = new Singleton29();
    }

    public static Singleton29 getInstance() {
        return Holder.INSTANCE;
    }

}

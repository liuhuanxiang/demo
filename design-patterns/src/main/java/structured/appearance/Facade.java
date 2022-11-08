package structured.appearance;

public class Facade {
    
    
    SubSystemA a = new SubSystemA();
    
    SubSystemB b = new SubSystemB();
    
    SubSystemC c = new SubSystemC();
    
    public void marry() {
        a.test1();
        b.test1();
        c.test1();
    }
    
}
